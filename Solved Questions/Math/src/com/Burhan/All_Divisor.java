package com.Burhan;

public class All_Divisor {
    public static void main(String[] args) {
        allDivisor(30);
        System.out.println();
        allSortedDivisor(30);
    }

    static void allDivisor(int n) {
        // ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i*i <= n; i++) {
            if (n%i==0) {
                System.out.print(i + " " + n/i +" ");
            }
        }
    }
    
    // Sorted Divisors
    static void allSortedDivisor(int n) {
        // ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i*i < n; i++) {
            if (n%i==0) {
                System.out.print(i + " ");
            }
        }
        for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            if (n%i==0) {
                System.out.print(n/i+" ");
            }
        }
    }
}
