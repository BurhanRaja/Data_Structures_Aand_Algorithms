package com.Burhan.String;

public class Skip_String {
    public static void main(String[] args) {
        String s = "Ilikeappapplesomuchapp";
        // System.out.println(skipStr(s));
        System.out.println(skipAppNotApple(s));
    }

    // Skip apple
    static String skipStr(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("apple")) {
            return skipStr(s.substring(5));
        }
        else {
            return s.charAt(0) + skipStr(s.substring(1));
        }
    }

    // Skip app not apple
    static String skipAppNotApple(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("app") && !s.startsWith("apple")) {
            return skipAppNotApple(s.substring(3));
        }
        else {
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}