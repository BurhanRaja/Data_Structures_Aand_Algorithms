package com.Burhan;

public class Prime_Factors {
    public static void main(String[] args) {
        primeFactor(9);
    }

    static void primeFactor(int n) {
        if (n<=1) {
            System.out.print(-1);
            return;
        }

        int i=2;
        while (i*i <= n) {
            if (n%i==0) {
                System.out.print(i + " ");
                n/=i;
            }
            else {
                i++;
            }
        }
        if (n>1) {
            System.out.print(n);
        }
    }
}