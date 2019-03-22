package main;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {
    private  static int vertex;
    private static LinkedList<Integer> adjLinkedList[];

    public DFS(int v) {
      this.vertex = v;
      adjLinkedList = new LinkedList[vertex];
      for(int i = 0; i<vertex; i++){
          adjLinkedList[i] = new LinkedList<>();
      }
    }

    public static void addEdge(int nodeOne,int nodeTwo){
        adjLinkedList[nodeOne].add(nodeTwo);
        adjLinkedList[nodeTwo].add(nodeOne);
    }

    public static void DFSOnAction(int source){
        boolean[] visit = new boolean[vertex];
        Stack<Integer> stack = new Stack<>();
        int currentNode;

        if(!visit[source]){
            stack.push(source);
            System.out.print(source + " ");
        }


        currentNode = source;
        visit[currentNode] = true;

        while (!stack.empty()){
            if(adjLinkedList[currentNode].size() > 0){
                for(Integer x : adjLinkedList[currentNode]){
                    System.out.println(x);
                    if(!visit[x]){
                        DFSOnAction(x);
                    }

            }
        }else{
                stack.pop();
                int back = stack.peek();
                DFSOnAction(back);
            }

        }



    }

    public static void main(String[] args) {
        int totalVertex = 6;
        new DFS(totalVertex);

        addEdge(0,1);
        addEdge(0,2);
        addEdge(1,3);
        addEdge(1,4);
        addEdge(3,4);
        addEdge(3,5);
        addEdge(4,5);
        int sourceNode = 0;
        DFSOnAction(sourceNode);
    }

}
