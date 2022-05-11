package com.Burhan;

import java.util.Arrays;

public class Generate_Spiral {
    public static void main(String[] args) {
        generateMatrix(1);   
    }

    static int[][] generateMatrix(int n) {
        int nrow = n;
        int ncol = n;
        int[][] arr = new int[nrow][ncol];
        int count = 1;

        if (nrow == 1) {
            for (int i = 0; i<ncol; i++) {
                arr[0][i] = count;
                count++;
            }
        }
        else if (ncol == 1) {
            for (int i = 0; i<nrow; i++) {
                arr[i][0] = count;
                count++;
            }
        }

        else{ 
            int top = 0;
            int left = 0;
            int right = ncol-1;
            int bottom = nrow-1;

            while (top<=bottom && left<=right) {
                for (int i = left; i <= right; i++) {
                    arr[top][i] = count;
                    count++;
                }
                top++;
                for (int i = top; i <= bottom; i++) {
                    arr[i][right] = count;
                    count++;
                }
                right--;

                if (top<=bottom) {
                    for (int i = right; i >= left; i--) {
                        arr[bottom][i] = count;
                        count++;
                    }
                    bottom--;
                }
                
                if (left<=right) {
                    for (int i = bottom; i >= top; i--) {
                        arr[i][left] = count;
                        count++;
                    }
                    left++;
                }
            }
        }
        
        return arr;
    }
}
