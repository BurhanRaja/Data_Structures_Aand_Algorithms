package com.Burhan.Pattern_Questions;

public class Pattern_1 {
    public static void main(String[] args) {
        int row = 4; 
        int col = 0;

        pattern(row, col);
    }

    static void pattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            pattern(row, col+1);
        }
        else {
            System.out.println();
            pattern(row-1, 0);
        }
    }
}
