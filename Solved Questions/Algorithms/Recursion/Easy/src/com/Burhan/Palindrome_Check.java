package com.Burhan;

public class Palindrome_Check {
    public static void main(String[] args) {
        String s = "abcba";
        int start = 0;
        int end = s.length()-1;
        boolean ans = palindromeCheck(s, start, end);
        System.out.println(ans);
    }

    // This is two pointer in recursion
    static boolean palindromeCheck(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        return (s.charAt(start) == s.charAt(end)) && palindromeCheck(s, start+1, end-1);
    }
}