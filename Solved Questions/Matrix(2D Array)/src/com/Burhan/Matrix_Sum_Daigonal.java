package com.Burhan;

public class Matrix_Sum_Daigonal {
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };

        sumDiagonal(arr);
    }

    static void sumDiagonal(int[][] arr) {
        int nRow = 0;
        int nCol = 0;
        int sumL = 0;
        int sumR = 0;

        while (nRow < arr.length && nCol < arr.length) {
            sumL += arr[nRow][nCol];
            nRow++;
            nCol++;
        }

        nRow = 0;
        nCol--;

        while (nRow < arr.length && nCol >= 0) {
            if (nRow == nCol) {
                nRow++;
                nCol--;
                continue;
            }
            sumR += arr[nRow][nCol];
            nRow++;
            nCol--;
        }

        int ans = sumL+sumR;

        System.out.println(ans);
    }
}
