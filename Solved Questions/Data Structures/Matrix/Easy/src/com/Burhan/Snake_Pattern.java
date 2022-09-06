package com.Burhan;

public class Snake_Pattern {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        snakePattern(arr);
    }

    // Time Complexity - theta(row*col)
    static void snakePattern(int[][] arr) {
        int row = 0;

        while (row < arr.length) {
            if (row%2 == 0) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + " ");
                }
                row++;
            }
            else {
                for (int col = arr[row].length-1; col >= 0 ; col--) {
                    System.out.print(arr[row][col] + " ");
                }
                row++;
            }
        }
    }
}