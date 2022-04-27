package com.Burhan;

public class Rotate_90_AntiClockwise {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6 , 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        rotate(arr);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    static void rotate(int[][] arr) {
        int n = arr.length;
        int row = 0;
        int col = arr[n-1].length;

        transposeArray(arr);

        for (int i = 0; i < n; i++) {
            while (row < col) {
                swap(arr, row, col);
            }
            row++;
            col--;
        }
    }

    static void transposeArray(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = row+1; col < arr[row].length; col++) {
                swap(arr, row, col);
            }
        }
    }

    static void swap(int[][] arr, int row, int col) {
        int temp = arr[row][col];
        arr[row][col] = arr[col][row];
        arr[col][row] = temp;
    }
}
