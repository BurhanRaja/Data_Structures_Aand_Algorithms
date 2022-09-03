package com.Burhan;

import java.util.Deque;
import java.util.LinkedList;

public class Max_Of_All_Subarray_Of_Size_k {
    public static void main(String[] args) {
        // int[] arr = {10, 8, 5, 12, 15, 7, 6};
        int[] arr = {50, 20, 40, 30, 10, 60};
        int k = 3;
        maxSubarray2(arr, k);
    }

    static void maxSubarray(int[] arr, int k) {
        for (int i = 0; i < arr.length-k+1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i;j < k+i; j++) {
                max = Math.max(max, arr[j]);
            }
            System.out.print(max + " ");
        }
    }

    // Efficient
    static void maxSubarray2(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) { // To check whether the last index in deque is less than the current index in array
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for (int i = k; i < arr.length; i++) {
            System.out.print(arr[dq.peek()] + " ");
            while (!dq.isEmpty() && dq.peek() <= i-k) { // To check that index of the previous subarray is not there
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) { // To check whether the last index in deque is less than the current index in array
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()]);
    }


}