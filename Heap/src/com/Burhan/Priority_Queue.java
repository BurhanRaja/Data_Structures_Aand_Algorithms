package com.Burhan;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        // Min Heap
        PriorityQueue<Integer> pqMin = new PriorityQueue<>();
        pqMin.add(90);
        pqMin.add(20);
        pqMin.add(100);
        pqMin.add(40);

        System.out.println(pqMin);
        System.out.println(pqMin.peek());
        System.out.println(pqMin.poll());
        System.out.println(pqMin.peek());

        // Max Heap
        PriorityQueue<Integer> pqMax = new PriorityQueue<>(Collections.reverseOrder());

        pqMax.add(90);
        pqMax.add(20);
        pqMax.add(100);
        pqMax.add(40);

        System.out.println(pqMax);
        System.out.println(pqMax.peek());
        System.out.println(pqMax.poll());
        System.out.println(pqMax.peek());

    }
}
