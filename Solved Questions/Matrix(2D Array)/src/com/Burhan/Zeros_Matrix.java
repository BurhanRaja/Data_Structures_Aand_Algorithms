package com.Burhan;

public class Zeros_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {0, 1, 1, 0},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1}
        };

        zeroMatrix(arr);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }

    static void zeroMatrix(int[][] arr) {
        int row = 0;
        int col = 0;

        for (row = 0; row < arr.length; row++) {
            for (col = 0; col < arr.length; col++) {
                if (arr[row][col] == 0) {
                    break;
                }
            }
        }

        System.out.println(col);
        System.out.println(row);

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i][col] = 0;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     arr[row][i] = 0;
        // }
    }


}
