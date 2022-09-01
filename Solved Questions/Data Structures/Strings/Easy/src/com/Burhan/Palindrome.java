package com.Burhan;

public class Palindrome {
    public static void main(String[] args) {
        String s = "ABCDCBA";
        boolean ans = checkPalindrome(s);
        System.out.println(ans);
    }

    // TC - O(n)
    static boolean checkPalindrome(String s) {
        int count = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == s.charAt(count)) {
                count++;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    // Naive - TC - theta(n) and AS - theta(n)
    static boolean isPalindrome(String s) {
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        return (rev.toString() == s);
    }
}