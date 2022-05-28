package com.Burhan.Array_Questions;

public class Linear_Search {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {19,10,5,10,40,53,68,79,81};
        System.out.println(linearSearch(arr, 40, 0));
        System.out.println(find(arr, 40, 0));
    }
    
    // First way
    static int linearSearch(int[] arr, int target, int n) {
        if (n==arr.length) {
            return -1;
        }
        if (arr[n] == target) {
            return n;
        }
        else{
            return linearSearch(arr, target, n+1);
        }
    }

    // Second way
    static boolean find(int[] arr, int target, int n) {
        if (n==arr.length) {
            return false;
        }
        return arr[n] == target || find(arr, target, n+1);
    }
}
