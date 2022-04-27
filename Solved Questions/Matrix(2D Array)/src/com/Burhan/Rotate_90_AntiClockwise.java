package com.Burhan;

public class Rotate_90_AntiClockwise {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6 , 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // {4, 8, 12, 16},
        // {3, 7, 11, 15},
        // {2, 6, 10, 14},
        // {1, 5, 9, 13}


        // rotate2DArray(arr);
        rotateArray(arr);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }

    static void rotate2DArray(int[][] arr) {
        int n = arr.length;
        int[][] temp = new int[n][n];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                temp[n-col-1][row] = arr[row][col];
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(temp[row][col] + " ");
            }
            System.out.println();
        }
    }


    // Efficient
    static void rotateArray(int[][] arr) {
        transposeArray(arr);
        // {1, 5, 9, 13}
        // {2, 6, 10, 14}
        // {3, 7, 11, 15}
        // {4, 8, 12, 16}

        int nRow = arr.length-1;

        // Swaping in real time;
        // This is how rows are swaped
        // We are swaping column wise like 1 will become last and second-last will become second
        for (int i = 0; i < arr.length; i++) {
            int low = 0; // 0 1       2
            int high = nRow; // 3 2   1

            while(low < high) {
                int temp = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i] = temp;

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
