package com.Burhan;

import java.util.*;

public class Pattern_7 {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print(" ");
            }
            for (int k = i+1; k > 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        inp.close();
    }
}
