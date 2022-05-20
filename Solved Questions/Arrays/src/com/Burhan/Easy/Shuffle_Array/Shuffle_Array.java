package com.Burhan.Easy.Shuffle_Array;

import java.util.*;

// Question:-

// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7] 
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].


public class Shuffle_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        // int[] arr = {1, 1, 2, 2, 3, 3};

        int[] ans = shuffleArray(arr, 4);
        System.out.println(Arrays.toString(ans));

        // int n = arr.length;
        // int halfN = n/2;
        // System.out.println(halfN);
    }


//     Input: nums = [2,5,1,3,4,7], n = 3
//     Output: [2,3,5,4,1,7] 
//     Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

    static int[] shuffleArray(int[] nums, int n) {
        // {1,2,3,4,4,3,2,1}
        int ans [] = new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i+=2){
            ans[i]=nums[j];
            j++;
        }
        // {1, 0, 2, 0, 3, 0, 4}

        for(int i=1;i<2*n;i+=2){
            ans[i]=nums[j];
            j++;
        }
        // {1, 4, 2, 3, 3, 1, 4}
        return ans;

    }
}


