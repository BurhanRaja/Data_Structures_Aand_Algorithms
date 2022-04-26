package com.Burhan;

public class Matrix_Boundary_Traversal {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        boundaryTraversal(arr);
        // System.out.println(arr.length);
    }

    static void boundaryTraversal(int[][] arr) {
        int nRow = arr.length;
        int nCol = arr[nRow-1].length;

        if (nRow == 1) {
            for (int col = 0; col < nCol; col++) {
                System.out.print(arr[0][col] + " ");
            }
        }
        else if (nCol == 1) {
            for (int row = 0; row < nRow; row++) {
                System.out.print(arr[row][0] + " ");
            }
        }
        else {
            for (int i = 0; i < nCol; i++) {
                System.out.print(arr[0][i] + " ");
            }
            for (int i = 1; i < nRow; i++) {
                System.out.print(arr[i][nCol-1] + " ");
            }
            for (int i = nCol-2; i >= 0; i--) {
                System.out.print(arr[nRow-1][i] + " ");
            }
            for (int i = nRow-2; i >= 1; i--) {
                System.out.print(arr[i][0] + " ");
            }
        }
    }
}
