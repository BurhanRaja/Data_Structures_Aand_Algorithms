package com.Burhan;

import java.util.*;

public class Spiral_Matrix_ArrayList {
    public static void main(String[] args) {
        int[][] arr = {
            {1}
        };
        // int[][] arr = {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12}
        // };

        ArrayList<Integer> ans = spiralOrder(arr);
        System.out.println(ans);

    }

    static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int nRow = matrix.length;
        int nCol = matrix[nRow-1].length;
        
        if (nRow == 1) {
            for (int i = 0; i<nCol; i++) {
                list.add(matrix[0][i]);
            }
        }
        else if (nCol == 1) {
            for (int i = 0; i<nRow; i++) {
                list.add(matrix[i][0]);
            }
        }
        else {         
            int top = 0;
            int left = 0;
            int right = nCol-1;
            int bottom = nRow-1;
            
            while (top<=bottom && left<=right) {
                for (int i=left; i<=right; i++) {
                    list.add(matrix[top][i]);
                }
                top++;
                
                for (int i=top; i<=bottom; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
                if (top <= bottom) {
                    for (int i=right; i>=left; i--) {
                        list.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                if (left <= right) {
                    for (int i=bottom; i>=top; i--) {
                        list.add(matrix[i][left]);
                    }
                    left++;
                }
                
            }
        }
        
        return list;
    }
}
