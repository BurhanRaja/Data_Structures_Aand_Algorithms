package com.Burhan;

import java.util.*;

public class Pattern_5 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int c = 0;
        for (int i = 1; i < (2*n); i++) {
            if (i > n) {
                c = 2*n-i;
            }
            else {
                c=i;
            }
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        inp.close();
    }
}
