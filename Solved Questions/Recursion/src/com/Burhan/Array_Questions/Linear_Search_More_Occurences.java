package com.Burhan.Array_Questions;

import java.util.*;

public class Linear_Search_More_Occurences {
    public static void main(String[] args) {
        int[] arr = {1,3,89,10,4,4,6,4,8};
        
        // First Way
        findAllIndex(arr, 0, 4);
        System.out.println(list);

        // Second Way
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(findAllIndex2(arr, 0, 4, ans));
    }

    // First Way
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int n, int target) {
        if (n==arr.length) {
            return;
        }
        
        if (arr[n] == target) {
            list.add(n);
        }
        findAllIndex(arr, n+1, target);
    }

    // Second Way
    static ArrayList<Integer> findAllIndex2(int[] arr, int n, int target, ArrayList<Integer> anyList) {
        if (n==arr.length) {
            return anyList;
        }
        
        if (arr[n] == target) {
            anyList.add(n);
        }
        return findAllIndex2(arr, n+1, target, anyList);
    }
}
