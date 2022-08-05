package com.Burhan;

import java.util.*;

public class Min_Max_DS {

    static class MyDeque {
        Deque<Integer> dq;

        MyDeque() {
            dq = new LinkedList<>();
        }

        // Insert
        void insertMax(int x) {
            dq.offerLast(x);
        }
        void insertMin(int x) {
            dq.offerFirst(x);
        }

        // Delete
        int extractMax() {
            return dq.peekLast();
        }
        int extractMin() {
            return dq.peekFirst();
        }

        // Get
        int getMax() {
            return dq.getLast();
        }
        int getMin() {
            return dq.getFirst();
        }
    }

    public static void main(String[] args) {
        
    }
}