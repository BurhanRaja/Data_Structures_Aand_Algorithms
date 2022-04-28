package com.Burhan;

public class Flipping_Image {
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,0,0},
            {1,0,0,1},
            {0,1,1,1},
            {1,0,1,0}
        };

        flipImage(arr);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    static void flipImage(int[][] arr) {

        reverse(arr);
        
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == 1) {
                    arr[row][col] = 0;
                }
                else {
                    arr[row][col] = 1;
                }
            }
        }
    }

    static void reverse(int[][] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            int high = arr.length-1;

            while (low < high) {
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                low++;
                high--;
            }
        }
        
    }
}
