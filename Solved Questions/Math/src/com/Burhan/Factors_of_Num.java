package com.Burhan;

import java.util.ArrayList;

public class Factors_of_Num {
    public static void main(String[] args) {
        factor1(20);
        System.out.println();
        factor2(20);
        System.out.println();
        factor3(20);
    }

    // O(n)
    static void factor1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))
    static void factor2(int n) {
        for (int i = 1; i*i <= n; i++) {
            if (n%i==0) {
                if (n/i==i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }
    
    // Both the Complexity will be O(sqrt(n))
    static void factor3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if (n%i==0) {
                if (n/i==i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        // For sorted i and n/i
        for (int index = list.size()-1; index >= 0; index--) {
            System.out.print(list.get(index) + " ");
        }
    }
}
