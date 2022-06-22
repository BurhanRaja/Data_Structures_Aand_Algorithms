package com.Burhan;

import java.util.*;

public class Intersection_Two_Array {
    public static void main(String[] args) {
        int[] num1 = {4,9,5}; 
        int[] num2 = {9,4,9,8,4};

        // int[] ans = intersection(num1, num2);
        // System.out.println(Arrays.toString(ans));

        int[] arr = intersectionNumber(num1, num2);
        System.out.println(Arrays.toString(arr));
    }

    static void intersection(int[] num1, int[] num2) {
        // int freq = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (num1[i] == num1[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                continue;
            }

            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]){
                    list.add(num1[i]);
                    break;
                }
            }
        }
        
        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }

    static int[] intersectionNum(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            n1.add(nums1[i]);
        }
        
        for (int i = 0; i < nums2.length; i++) {
            n2.add(nums2[i]);
        }

        for(Integer s1: n1) {
            if (n2.contains(s1)) {
                list.add(s1);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    static int[] intersectionNumber(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> n1 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            n1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (n1.contains(nums2[i])) {
                list.add(nums2[i]);
                n1.remove(nums2[i]);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
