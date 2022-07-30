package com.Burhan;

import java.util.*;

public class Implement_Queue_DS {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        // does not throw exception and returns null
        // Adds element
        q.offer(10);
        q.offer(20);
        q.offer(30);
        // Removes element
        q.poll();
        // gives front
        q.peek();

        // throws exception if queue is empty
        // gives front element
        q.element(); 
        // Adds element
        q.add(40);
        // Removes element
        q.remove();

    }
}
