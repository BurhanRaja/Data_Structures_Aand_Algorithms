package com.Burhan.Easy_Questions;

public class Print_n_to_1 {
    public static void main(String[] args) {
        int n = 8;
        printNum(n);
    }

    static void printNum(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            n--;
            printNum(n);
        }
    }
}
