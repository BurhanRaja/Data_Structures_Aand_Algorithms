package com.Burhan;

public class Largest_Altitude {
    public static void main(String[] args) {
        // int[] arr = {-5,1,5,0,-7};
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] temp = new int[n+1];
        temp[0] = 0;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += gain[i];
            temp[i+1] = sum;
        }
        
        int maxValue = 0;
        for (int i = 0; i < n+1; i++) {
            if (temp[i] > maxValue) {
                maxValue = temp[i];
            }    
        }
        return maxValue;
    }
}
