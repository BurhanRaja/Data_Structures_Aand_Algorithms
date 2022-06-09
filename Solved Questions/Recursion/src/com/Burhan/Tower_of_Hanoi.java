package com.Burhan;

public class Tower_of_Hanoi {
    public static void main(String[] args) {
        int n = 3;
        char A = 'a';
        char B = 'b';
        char C = 'c';

        towerhanoi(n, A, B, C);
    }

    static void towerhanoi(int n, char A, char B, char C) {
        if (n==1) {
            System.out.println("Move " + n + " from " + A + " to " + C);
            return;
        }
        
        towerhanoi(n-1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        towerhanoi(n-1, B, A, C);
    }
}