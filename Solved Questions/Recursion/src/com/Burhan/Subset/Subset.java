package com.Burhan.Subset;

public class Subset {
    public static void main(String[] args) {
        subset("", "abc");
    }

    static void subset(String ans, String s) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = s.trim().charAt(0);

        subset(ans + ch, s.substring(1));
        subset(ans, s.substring(1));
    }
}
