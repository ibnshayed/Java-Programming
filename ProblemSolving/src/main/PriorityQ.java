package main;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {


        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.add(9);
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(2);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
        if(priorityQueue.isEmpty())
            System.out.println("true");
    }
}
