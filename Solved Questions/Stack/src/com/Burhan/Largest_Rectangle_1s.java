package com.Burhan;

import java.util.*;

public class Largest_Rectangle_1s {
    public static void main(String[] args) {
        // int[][] arr = {
        //     {0, 1, 1, 0},
        //     {1, 1, 1, 1},
        //     {1, 1, 1, 1},
        //     {1, 1, 0, 0}
        // };
        // int[][] arr = {
            //     {1, 0, 0, 1, 1},
            //     {0, 0, 0, 1, 1},
            //     {1, 1, 1, 1, 1},
            //     {0, 1, 1, 1, 1}
            // };
            int[][] arr = {
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {0, 1, 0, 0}
            };

        // int ans = largest1Rect(arr);
        int ans = largest1s(arr);
        System.out.println(ans);
    }

    // Naive Solution O(R^2 * C)
    static int largest1s(int[][] arr) {
        int res = 0;
        int nRow = arr.length;
        int nCol = arr[nRow-1].length;
        
        for (int row1 = nRow-1; row1 >=0 ; row1--) {
            int[] temp = new int[nCol];
            for (int col1 = 0; col1 < nCol; col1++) {
                int count = 0;
                if (arr[row1][col1] == 1) {
                    for (int row2 = row1; row2 >= 0; row2--) {
                        if (arr[row2][col1] == 1) {
                            count++;
                        }
                        else {
                            continue;
                        }
                    }
                    temp[col1] = count;
                }
                else {
                    continue;
                }
                res = Math.max(res, largestRect(temp));
            }
        }
        return res;
    }


    // Efficient O(r*n)
    static int largest1Rect(int[][] arr) {
        int res = largestRect(arr[0]);
        for (int row = 1; row < arr.length; row++) {
            for (int col= 0; col < arr[arr.length-1].length; col++) {
                if (arr[row][col] == 1) {
                    arr[row][col] += arr[row-1][col];
                }
            }
            res = Math.max(res, largestRect(arr[row]));
        }

        return res;
    }


    static int largestRect(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                int top = s.pop();
                int curr = arr[top] * (s.isEmpty() ? i : (i - s.peek() - 1));
                res = Math.max(res, curr);
            }
            s.push(i);
        }

        while (!s.isEmpty()){
            int top = s.pop();
            int curr = arr[top] * (s.isEmpty() ? (arr.length) : (arr.length - s.peek() - 1));
            res = Math.max(res, curr);
        }

        return res;
    }
}
