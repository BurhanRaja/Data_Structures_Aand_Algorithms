package com.Burhan;

import java.util.*;

public class Deque_Linkedlist {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.offerFirst(30);
        dq.offerFirst(20);
        dq.offerFirst(10);

        dq.offerLast(40);
        dq.offerLast(50);
        dq.offerLast(60);

        System.out.println(dq);

        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());

        System.out.println(dq.size());

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
    }
}
