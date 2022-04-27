package com.Burhan;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiralTraversal(arr);

    }

    static void spiralTraversal(int[][] arr) {
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
            int top = 0; 
            int left = 0;
            int bottom = nRow-1;
            int right = nCol-1;

            while (top<=bottom && left<=right) {
                for (int i = left; i <= right; i++) {
                    System.out.println(arr[top][i]);
                }
                top++;

                for (int i=top; i<=bottom; i++) {
                    System.out.println(arr[i][right]);
                }
                right--;
                if (top<=bottom) {
                    for (int i = right; i >= left; i--) {
                        System.out.println(arr[bottom][i]);
                    }
                    bottom--;
                }
                if(left<=right) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.println(arr[i][left]);
                    }
                    left++;
                }
            }

        }
    }
}
