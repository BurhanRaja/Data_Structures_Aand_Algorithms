package com.Burhan;

import java.util.*;

public class Pattern_6 {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        inp.close();
    }
}
