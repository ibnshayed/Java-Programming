package main;

import java.util.*;

public class StronglyConnectedComponent {
    private static int vertex;
    private static LinkedList<Integer> adjLinkedList[];
    private static int[] visit;
    public static Stack<Integer> stack;
    public static ArrayList<ArrayList<Integer>> sccGroupsList;


    public StronglyConnectedComponent(int totalVertex) {
        vertex = totalVertex;
        adjLinkedList = new LinkedList[vertex];
        visit = new int[vertex];
        stack = new Stack<>();
        sccGroupsList = new ArrayList<ArrayList<Integer>>();
        Arrays.fill(visit,0);
        for (int i = 0; i<vertex; i++){
            adjLinkedList[i] = new LinkedList<>();
        }
    }

    public static void addDirectedEdge(int nodeOne,int nodeTwo){
        adjLinkedList[nodeOne].add(nodeTwo);
    }

    public static StronglyConnectedComponent reverseDirectionOfEdge(){
        StronglyConnectedComponent scc = new StronglyConnectedComponent(vertex);
        for(int i = 0; i<vertex; i++){
            for (Integer x : adjLinkedList[i]){
                System.out.println(x + "  "+ i);
               adjLinkedList[x].add(i);
            }

        }
        return scc;
    }

    public static void dfsForStack(int source){
        List<Integer> list = new ArrayList<>();

    }

/*    public static void dfsForSCCGroup(int v,int i){

        for (Integer x : adjLinkedList[v]){
            if(visit[x] == 0)
                sccGroupsList.get(i).add(x);
        }
    }*/

    public static void getSCCGroups(){
        int i = 0;
        reverseDirectionOfEdge();
        Arrays.fill(visit,0);
        while (!stack.empty()){
            int currentNode = stack.pop();

            if(visit[currentNode] == 0){
                visit[currentNode] = 1;
                continue;
            }
            sccGroupsList.get(i).add(currentNode);

            for (Integer x : adjLinkedList[currentNode]){
                if(visit[x] == 0){
                    sccGroupsList.get(i).add(x);
                    visit[i] = 1;
                }
            }
            visit[currentNode] = 2;
            i++;
        }
        System.out.println(sccGroupsList.size());
        for(int k = 0; k<sccGroupsList.size(); k++){
            System.out.print("Group " + k + ": ");
            for (Integer x : sccGroupsList.get(i))
                System.out.print( x + " , ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int totalVertex = 8;
       StronglyConnectedComponent scc = new StronglyConnectedComponent(totalVertex);

        addDirectedEdge(0,1);
        addDirectedEdge(1,2);
        addDirectedEdge(2,1);
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
       getSCCGroups();

    }
}
