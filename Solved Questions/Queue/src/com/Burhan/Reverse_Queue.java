package com.Burhan;

import java.util.*;

public class Reverse_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(12);
        q.add(15);
        q.add(27);
        q.add(50);
        q.add(100);

        // Queue<Integer> ans = reverse(q);
        reverse(q);
        // System.out.print(q);

    }

    static Queue<Integer> reverse(Queue<Integer> q) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }

        return q;
    }
    
    static void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int x = q.remove();
        reverseQueue(q);
        q.add(x);
    }
}
