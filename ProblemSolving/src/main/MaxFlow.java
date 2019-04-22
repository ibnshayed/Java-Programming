package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class MaxFlow {
    private static int vertex;
    private static LinkedList<Integer> adjLinkedList[];
    private static int[][] costBetweenNode;
    private static boolean[] visited;
    private static Stack<Integer> stack;

    public MaxFlow(int v) {
        vertex = v;
        adjLinkedList = new LinkedList[vertex];
        costBetweenNode = new int[vertex][vertex];
        visited = new boolean[vertex];
        stack = new Stack<>();
        Arrays.fill(visited, false);

        for (int i = 0; i < vertex; i++) {
            adjLinkedList[i] = new LinkedList<>();
        }
    }

    public static void addEdge(int nodeOne, int nodeTwo, int cost) {
        adjLinkedList[nodeOne].add(nodeTwo);
        adjLinkedList[nodeTwo].add(nodeOne);
        costBetweenNode[nodeOne][nodeTwo] = cost;
        costBetweenNode[nodeTwo][nodeOne] = cost;
    }

    public static void DFS(int source, int destination, boolean[] visited) {
        visited[source] = true;
        for (Integer x : adjLinkedList[source]) {
            if (!visited[x] && costBetweenNode[source][x] != 0) {
                if (x != destination)
                    break;
                else DFS(x, destination, visited);
            }
        }
        stack.push(source);

    }

    public static void MaxFlowOnAction(int source, int destination) {
        int sum = 0;

    }

    public static void main(String[] args) {
        int totalVertex = 7;
        new MaxFlow(totalVertex);

        int source;
        int destination;

    }
}
