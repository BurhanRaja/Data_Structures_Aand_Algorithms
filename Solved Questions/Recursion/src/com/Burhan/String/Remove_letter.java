package com.Burhan.String;

public class Remove_letter {
    public static void main(String[] args) {
        String answer = rmvL("baccad", "", 0);
        System.out.println(answer);
    }

    static String rmvL(String s, String ans, int n) {
        if (n == s.length()) {
            return ans;
        }

        char ch = s.trim().charAt(n);
        if (ch != 'a') {
            return rmvL(s, ans + ch, n+1);
        }
        else {
            return rmvL(s, ans, n+1);
        }
    }
}
