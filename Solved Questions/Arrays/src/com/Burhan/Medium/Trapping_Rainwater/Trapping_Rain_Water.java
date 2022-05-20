package com.Burhan.Medium.Trapping_Rainwater;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        // int[] blocks = {3, 0, 1, 2, 5};
        int[] blocks = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        // System.out.print(trap_water(blocks));
        System.out.print(trap_waterTwo(blocks));
    }

    // Naive methods:-
    // {{{{
    static int trap_water(int[] arr) {
        int n = arr.length;
        int res = 0;

        for (int i = 1; i < n-1; i++) {
            int lMax = arr[i];
            int rMax = arr[i];

            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }
            for (int j = i+1; j < n; j++) {
                rMax = Math.max(rMax, arr[j]);
            }
            res += Math.min(lMax, rMax) - arr[i];
        }
        return res;
    }

    // }}}}

    static int trap_waterTwo(int[] arr){
        int n = arr.length;
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        int res = 0;

        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(arr[i], lMax[i-1]);
        }
        
        rMax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i+1]);
        }

        for (int i = 1; i < n-1; i++) {
            res += Math.min(lMax[i], rMax[i]) - arr[i];
        }

        return res;

    }
}
