package com.Burhan;

public class Print_1_to_n {
    public static void main(String[] args) {
        int n = 9;
        printNum(n, 1);
    }

    static void printNum(int n, int i) {
        if (i <= n) {
            System.out.print(i + " ");
            i++;
            printNum(n, i);
        }
    }
}
