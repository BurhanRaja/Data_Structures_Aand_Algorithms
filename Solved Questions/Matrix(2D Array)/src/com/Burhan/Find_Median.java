
package com.Burhan;

import java.util.Arrays;

public class Find_Median {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 10, 20},
            {15, 25, 30},
            {5, 8, 40}
        };

        median(arr);
    }

    // Naive
    static void median(int[][] arr) {
        int nRow = arr.length;
        int nCol = arr[nRow-1].length;
        int[] temp = new int[nRow*nCol];
        int count = 0;
        
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                temp[count] = arr[row][col];
                count++;
            }
        }
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
    }

    // Efficient
    static void median2(int[][] arr){
        
    }
}
