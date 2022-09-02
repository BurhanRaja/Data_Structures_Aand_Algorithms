package com.Burhan;

import java.util.TreeSet;

public class Ceil_On_Left {
    public static void main(String[] args) {
        int[] arr = {2, 8, 30, 15, 25, 12};
        ceilLeft(arr);
    }

    static void ceil(int[] arr) {
        System.out.print(-1 + " ");

        for (int i = 1; i < arr.length; i++) {
            int diff = Integer.MAX_VALUE;

            for (int j = 0; j < i; j++) {
                if (arr[j] >= arr[i]) {
                    diff = Math.min(diff, arr[j] - arr[i]);
                }
            }

            if (diff == Integer.MAX_VALUE) {
                System.out.print(-1 + " ");
            } else {
                System.out.print((arr[i] + diff) + " ");
            }
        }
    }

    // Efficient
    static void ceilLeft(int[] arr) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(arr[0]);
        System.out.print(-1 + " ");

        for (int i = 1; i < arr.length; i++) {
            
            if (t.ceiling(arr[i]) != null) {
                System.out.print(t.ceiling(arr[i]) + " ");
            }
            else {
                System.out.print(-1 + " ");
            }

            t.add(arr[i]);
        }
    }
}