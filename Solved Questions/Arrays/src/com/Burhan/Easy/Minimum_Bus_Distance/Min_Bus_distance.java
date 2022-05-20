package com.Burhan.Easy.Minimum_Bus_Distance;

public class Min_Bus_distance {
    public static void main(String[] args) {
        int[] arr = {7,10,1,12,11,14,5,0};
        int ans = disBus(arr, 0, 7);
        System.out.println(ans);
    }

    static int disBus(int[] distance, int start, int destination) {
        int n = distance.length;
        int clockwise = 0;
        int counterclockwise = 0;
        
        int i;
        for (i=start; i<destination; i++) {
            clockwise += distance[i];
        }
        for (int j = i; j < n; j++) {
            counterclockwise += distance[j];
        }
        
        int res = Math.min(clockwise, counterclockwise);
        System.out.println(clockwise + " " + counterclockwise);
        return res;
    }
}
