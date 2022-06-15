package com.Burhan.Easy.Frequency_In_Array;

public class Frequency_in_Sorted {
    public static void main(String[] args) {
        // int[] nums = {10, 10, 10, 20, 30, 30};
        int[] nums = {40,50};

        frequency(nums);
    }

    static void frequency(int[] arr) {
        int n = arr.length;
        int freq = 1;
        int i = 1;

        
        while (i < n) {
            while (i < n && arr[i] == arr[i-1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " = " + freq);
            i++;
            freq =1;
        }
        
        // To print the next int if the condition is met
        if (n == 1 || arr[n-1] != arr[n-2]) {
            System.out.println(arr[i-1] + " = " + 1);
        }
    }
}
