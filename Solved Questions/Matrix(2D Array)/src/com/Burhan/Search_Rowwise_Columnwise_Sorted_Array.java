package com.Burhan;

import java.util.ArrayList;
import java.util.Arrays;

public class Search_Rowwise_Columnwise_Sorted_Array {
    public static void main(String[] args) {
        // int[][] arr = {
        //     {10, 20, 30, 40},
        //     {15, 25, 35, 45},
        //     {27, 29, 37, 48},
        //     {32, 33, 39, 50}
        // };
        // int[][] arr = {
        //     {1, 2, 3, 4},
        //     {5, 6, 7, 8},
        //     {9, 10, 11, 12},
        //     {13, 14, 15, 16}
        // };
        int[][] arr = {
            {1,3,5,7},
            {10,11,16,20}, 
            {23,30,34,60}
        };

        int x = 13;
        int[] ans = search(arr, x);
        System.out.println(Arrays.toString(ans));
        ArrayList<Integer> list = new ArrayList<Integer>();

        // System.out.println(searching(arr, x));
        // Why top right or bottom left to start from?
        // Becoz the top left corner is the smallest element if x is greater than 10 we cannot decide where to go and the same reason goes for the bottom right corner it is greater than all the elements.
    }

    static int[] search(int[][] arr, int x) {
        int countRow = 0;
        int countCol = arr[arr.length-1].length-1;

        while (countRow <= countCol) {
            if (countRow > arr.length-1 || countCol < 0) {
                return new int[] {-1, -1};
            }
            if (x == arr[countRow][countCol]) {
                return new int[] {countRow, countCol};
            }
            if (x > arr[countRow][countCol]) {
                countRow++;
            }
            else {
                countCol--;
            }
        }
        return new int[] {-1, -1};
    }

    // static boolean searching(int[][] matrix, int target) {
    //     int row = 0;
    //     int col = matrix[row].length-1;
    //     while (row <= matrix.length-1 && col >= 0) {
            
    //         if (target == matrix[row][col]) {
    //             return true;
    //         }
            
    //         if (target > matrix[row][col]) {
    //             row++;
    //         }
    //         else {
    //             col--;
    //         }
    //     }
    //     return false;
    // }
}
