package com.Burhan;

import java.util.ArrayDeque;

public class Balance_Paranthesis {
    public static void main(String[] args) {
        String brackets = "(({{}}))[]";
        System.out.println(balancedOrNot(brackets));
    }

    static boolean balancedOrNot(String brackets) {
        ArrayDeque<Character> s = new ArrayDeque<>();
        for (int i = 0; i < brackets.length(); i++) {
            char x = brackets.trim().charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                s.push(x);
            }
            else {
                if (s.isEmpty()) {
                    return false;
                } 
                else if(!mathcing(s.peek(), x)) {
                    return false;
                }
                else {
                    s.pop();
                }
            }
        }

        return s.isEmpty();
    }

    static boolean mathcing(char a, char b) {
        return a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']';
    }
}