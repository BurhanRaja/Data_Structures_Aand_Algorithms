package com.Burhan;

import java.util.Arrays;
import java.util.Scanner;

class TwoD_Array_Input {
    public static void main(String[] args) {
        
        // Initialization of 2D-array
        // int[][] num = new int[3][];
        
        // int[][] arr = {
        //                 {1, 2, 3},
        //                 {4, 5},
        //                 {6, 7, 8, 9}
        //             }; 

        
        Scanner inp = new Scanner(System.in);
        
        // Initializing an array
        int[][] arr2D = new int[3][2];

        // *** Input of 2D array ***

        // Taking one-one row
        for (int row = 0; row < arr2D.length; row++) {
            // Taking number in Columns of rows
            for (int col = 0; col < arr2D[row].length; col++) {
                // Input the numbers
                arr2D[row][col] = inp.nextInt();
            }
        }
        
        // *** Printing the a 2D array ***

        // 1 - Way
        // for (int row = 0; row < arr2D.length; row++) {
        //     for (int col = 0; col < arr2D[row].length; col++) {
        //         System.out.print(arr2D[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // 2 - Way
        // for (int[] a : arr2D) {
        //     System.out.println(Arrays.toString(a));
        // }

        // 3 - Way
        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
        }

        inp.close();
    }
}