package com.Burhan;

import java.util.*;

public class Pattern_5 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        inp.close();
    }
}
