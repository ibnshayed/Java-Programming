package main;

import java.util.*;

public class StronglyConnectedComponent {
    private static int vertex;
    private static LinkedList<Integer> adjLinkedList[];
    private static LinkedList<Integer> reverseGraph[];
    private static int[] visit;
    public static Stack<Integer> stack;
    public static int[][] sccGroupsList;


    public StronglyConnectedComponent(int totalVertex) {
        vertex = totalVertex;
        adjLinkedList = new LinkedList[vertex];
        reverseGraph = new LinkedList[vertex];
        visit = new int[vertex];
        stack = new Stack<>();
        sccGroupsList = new int[vertex][vertex];

        Arrays.fill(visit,0);
        for (int i = 0; i<vertex; i++){
            adjLinkedList[i] = new LinkedList<>();
            reverseGraph[i] = new LinkedList<>();
        }
    }

    public static void addDirectedEdge(int nodeOne,int nodeTwo){
        adjLinkedList[nodeOne].add(nodeTwo);
        reverseGraph[nodeTwo].add(nodeOne);
    }

    public static void getStack(int source){
        visit[source] = 1;

        for (Integer x : adjLinkedList[source]){
            if(visit[x] == 0)
                getStack(x);
        }
        stack.push(source);
        visit[source] = 2;

    }

    public static void DFS(int source){
        visit[source] = 1;

        for (Integer x : adjLinkedList[source]){
            if(visit[x] == 0)
                DFS(x);
        }
        visit[source] = 2;

    }

    public static void getSCCGroup(){
        int i = 0,j=0;
        Arrays.fill(visit,0);
        getStack(0);
        int currentNode;
        while (!stack.empty()){
            currentNode = stack.pop();
            if(visit[currentNode] != 2){
                continue;
            }
            sccGroupsList[i][j++] = currentNode;
            visit[currentNode] = 1;
            for (Integer x : reverseGraph[currentNode]){
                if(visit[x] == 0){
                    visit[x] = 2;
                    DFS(x);
                    sccGroupsList[i][j++] = x;
                }

            }
            visit[currentNode] = 2;
            i++;
            j = 0;

        }
        for (int m = 0; m<vertex; m++){
            for (int n = 0; n<vertex; n++)
                System.out.print(sccGroupsList[m][n] + " ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int totalVertex = 8;
       StronglyConnectedComponent scc = new StronglyConnectedComponent(totalVertex);

        addDirectedEdge(0,1);
        addDirectedEdge(1,2);
        addDirectedEdge(2,0);
        addDirectedEdge(2,3);
        addDirectedEdge(3,4);
        addDirectedEdge(4,5);
        addDirectedEdge(5,6);
        addDirectedEdge(6,4);
        addDirectedEdge(6,7);

        for(int i = 0; i<totalVertex; i++){
            System.out.print(i + " has child node : ");
            for(Integer x : adjLinkedList[i])
                System.out.print(x + " ");
            System.out.println();
        }
        System.out.println("Reverse Graph : ");

        for(int i = 0; i<totalVertex; i++){
            System.out.print(i + " has child node : ");
            for(Integer x : reverseGraph[i])
                System.out.print(x + " ");
            System.out.println();
        }
        getStack(0);

        System.out.println(stack);
        System.out.println("SCC Groups :");
        getSCCGroup();

    }
}
