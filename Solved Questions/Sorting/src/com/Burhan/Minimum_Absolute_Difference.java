package com.Burhan;

import java.util.*;

public class Minimum_Absolute_Difference {
    public static void main(String[] args) {
        // int[] arr = {3,8,-10,23,19,-4,-14,27};
        // int[] arr = {1,3,6,10,15};
        int[] arr = {4,2,1,3};
        List<List<Integer>> minArr = minDiff(arr);
        for (int i = 0; i < 3; i++) {
            List<Integer> num = minArr.get(i);
            System.out.println(num);
        }


    }

    // Time Complexity = O (n * nlogn ) = O (n + nlogn)

    static List<List<Integer>> minDiff(int[] arr) {
        
        List<List<Integer>> minArr = new ArrayList<List<Integer>>();
        
        Arrays.sort(arr);
        
        int minimum = arr[arr.length-1];
        int count = 0;
        
        for (int i = 0; i < arr.length-1; i++) {
            if (minimum > arr[i+1] - arr[i]) {
                minimum = arr[i+1] - arr[i];
            }    
        }

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i+1] - arr[i] == minimum) {
                minArr.add(new ArrayList<Integer>());
                minArr.get(count).add(0, arr[i]);
                minArr.get(count).add(1, arr[i+1]);
                count++;
            }

        }

        return minArr;
    }
}
