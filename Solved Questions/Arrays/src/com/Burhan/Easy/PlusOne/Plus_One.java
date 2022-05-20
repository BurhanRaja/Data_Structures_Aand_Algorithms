package com.Burhan.Easy.PlusOne;

import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int[] arr = {9,5,9};
        // int[] ans = plusOne(arr);
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
        // System.out.println(ans);
    }
    // [1,2,3]
    // [4,3,2,1]
    // [9]

    // {4, 3, 2, 1};
    static int[] plusOne(int[] digits) {
        
        int n = digits.length;
        
        for(int i = n-1; i>=0; i--){

            // taking the condition of the numbers smaller than 9
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            // If the above condition does not execute the digit[i] will be 0
            digits[i] = 0;
        }
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }
}
