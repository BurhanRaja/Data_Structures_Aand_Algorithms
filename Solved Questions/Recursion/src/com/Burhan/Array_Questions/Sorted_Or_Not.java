package com.Burhan.Array_Questions;

public class Sorted_Or_Not {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,14,19,20};
        System.out.println(sortedOrNot(arr, 0));
    }

    // static boolean sortedOrNot(int[] arr, int n) {
    //     if (n==(arr.length-1)) {
    //         return true;
    //     }

    //     if (arr[n] < arr[n+1]) {
    //         n++;
    //         return sortedOrNot(arr, n);
    //     }
    //     else {
    //         return false;
    //     }
    // }


    // Can also do this
    static boolean sortedOrNot(int[] arr, int n) {
        if (n==(arr.length-1)) {
            return true;
        }    
        return arr[n] < arr[n+1] && sortedOrNot(arr, n+1);
        
    }
}
