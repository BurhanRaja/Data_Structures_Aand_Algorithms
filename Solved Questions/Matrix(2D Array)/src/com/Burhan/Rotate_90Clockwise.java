package com.Burhan;

public class Rotate_90Clockwise {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6 , 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // {13, 9, 5, 1}
        // {14, 10, 6, 2}
        // {15, 11, 7, 3}
        // {16, 12, 8, 4}

        rotate2DArray(arr);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
    
    static void rotate2DArray(int[][] arr) {
        transposeArray(arr);

        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int low = 0; // 0 1       2
            int high = n-1; // 3 2   1

            while(low < high) {
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;

                low++;
                high--;
            }
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
