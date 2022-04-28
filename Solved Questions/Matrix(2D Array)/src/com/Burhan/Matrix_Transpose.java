package com.Burhan;

class Matrix_Transpose {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // transpose(arr);
        transpose(arr);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Naive Method
    static void transpose(int[][] arr) {
        int nRow = arr.length;
        int nCol = arr[nRow-1].length;
        int[][] temp = new int[nRow][nCol];
        if (nRow == nCol) {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    temp[row][col] = arr[col][row];
                }
            }
            
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    arr[row][col] = temp[row][col];
                }
            }


        }
    }

    // Efficient Method

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