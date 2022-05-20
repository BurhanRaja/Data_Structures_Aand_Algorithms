package com.Burhan.Easy.Leaders_In_Array;

public class Leaders_in_Array {
    public static void main(String[] args) {
        int[] arr = {7, 4, 10, 3, 6, 5, 2};
        // leader(arr);
        leader_array(arr);
        // System.out.println();
    }

    static void leader(int[] arr) {
        
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {     
            boolean flag = false;
            for (int j = i+1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.print(arr[i] + " ");
            }
        }
    }


    // Prints from right to left
    static void leader_array(int[] arr) {
        int n = arr.length;

        int current_leader = arr[n-1];
        System.out.print(current_leader + " ");

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > current_leader) {
                current_leader = arr[i];
                System.out.print(current_leader + " ");
            }
        }
    }
}
