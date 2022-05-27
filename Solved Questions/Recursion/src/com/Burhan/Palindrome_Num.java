package com.Burhan;

public class Palindrome_Num {
    public static void main(String[] args) {
        int n = 1001234;
        boolean ans = palindrome(n);
        System.out.println(ans);
    }

    static boolean palindrome(int n) {
        if (n == reverse(n)) {
            return true;
        } else {
            return false;
        }
    }

    static int sum = 0;

    static int reverse(int n) {
        if (n > 0) {
            sum = 10 * sum + n % 10;
            reverse(n /= 10);
        }
        return sum;
    }
}
