package com.Burhan;

import java.util.*;

class Max_Product_Three_Num {
    public static void main(String[] args) {
        int[] arr = {-100,-98,-1,2,3,4};
        int ans = maxProdNum(arr);
        System.out.println(ans);
    }

    static int maxProdNum(int[] arr) {
        
        Arrays.sort(arr);
        // Here, Only last 3 numbers and 1st two numbers whould be considered to have the maximum products becoz it is a sorted array.
        int product = Math.max(arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3], arr[arr.length-1]*arr[0]*arr[1]);
        return product;
    }
}