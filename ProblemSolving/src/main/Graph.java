package main;

import java.util.*;

public class Graph {
    private static int V;
    private static int cost[];
    private static Vector<Integer> adjListArray[];

    public Graph(int V) {
        this.V = V;
        adjListArray = new Vector[V];

        for (int i = 0; i < V; i++)
            adjListArray[i] = new Vector<>();
    }

    public static void addEdge(int u, int v) {
        adjListArray[u].add(v);
        adjListArray[v].add(u);
    }

    public static void displayGraph() {

        for (int i = 0; i < V; i++) {
            System.out.println("Node: " + i);
            System.out.print("Head ");
            for (Integer x : adjListArray[i]) {
                System.out.print(" -> " + x);
            }
            System.out.println();
        }

    }
    public static void BFS(int sourceNode){
        boolean visit[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> bfs = new ArrayList<>();
        int currentNode;

        visit[sourceNode] = true;
        queue.add(sourceNode);


        while (!queue.isEmpty()){
            currentNode = queue.poll();
            bfs.add(currentNode);

            for (Integer x : adjListArray[currentNode]){
                if(!visit[x]){
                    visit[x] = true;
                    queue.add(x);
                }
            }

        }

        bfs.forEach(x -> System.out.print(x + " "));
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = 6;
        Graph graph = new Graph(v);
/*

        System.out.print("Enter a Test Case: ");
        int testCase = in.nextInt();
        System.out.println();

        for (int i = 1; i <= testCase; i++) {
            System.out.print("How many Edge you want to input: ");
            int noe = in.nextInt();
            System.out.println();

            for (int j = 1; j <= noe; j++) {

                int x = in.nextInt();
                int y = in.nextInt();

                addEdge(x, y);
            }
*/
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(2, 4);
        addEdge(3, 4);
        addEdge(4, 5);
        addEdge(5, 1);
        addEdge(5, 0);
        addEdge(5, 3);

        displayGraph();
        BFS(0);
        }

    }

