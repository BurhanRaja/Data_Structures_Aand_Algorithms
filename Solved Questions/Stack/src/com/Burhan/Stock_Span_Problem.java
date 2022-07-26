package com.Burhan;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Stock_Span_Problem {
    public static void main(String[] args) {
        // int[] arr = {13, 15, 12, 14, 16, 8, 6, 4, 10, 30};
        int[] arr = {30, 20, 25, 28, 27, 29};
        ArrayList<Integer> ans = stockSpan(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
        stockSpan1(arr);
    }

    // Naive
    static ArrayList<Integer> stockSpan(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);

        for (int i = 1; i < arr.length; i++) {
            int count = 1;
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    count++;
                }
                else {
                    break;
                }
            }
            list.add(count);
        }

        return list;
    }

    // Efficient
    static void stockSpan1(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(0);
        System.out.print(1 + " ");

        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            int span = s.isEmpty() ? i+1 : i-s.peek();
            System.out.print(span + " ");
            s.push(i);
        }
    }
}
