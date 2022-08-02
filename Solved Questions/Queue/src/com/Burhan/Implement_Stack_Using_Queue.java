package com.Burhan;

import java.util.*;

public class Implement_Stack_Using_Queue {

    static class Stack{
        Queue<Integer> q1, q2;

        Stack() {
            q1 = new ArrayDeque<>();
            q2 = new ArrayDeque<>();
        }

        int top() {
            return q1.element();
        }
        int size() {
            return q1.size();
        }
        int pop() {
            return q1.element();
        }

        void push(int x) {
            while (!q1.isEmpty()) {
                q2.add(q1.element());
                q1.remove();
            }
            q1.add(x);
            while (!q2.isEmpty()) {
                q1.add(q2.element());
                q2.remove();
            }
        }
    }
    public static void main(String[] args) {
        
    }
}