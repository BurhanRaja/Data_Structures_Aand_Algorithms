package com.Burhan;

import java.util.ArrayDeque;

public class Previous_Greater_Element {
    public static void main(String[] args) {
        int[] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        prevGreater(arr);
    }

    static void prevGreater(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(0);
        System.out.print(-1 + " ");
        
        int span;

        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span = -1;
            }
            else {
                span = arr[s.peek()];
            }
            System.out.print(span + " ");
            
            s.push(i);
        }
    }
}
