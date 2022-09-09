package com.Burhan;

import java.util.Stack;

public class Balanced_Paranthesis {
    public static void main(String[] args) {
        String str = "(({}))";
        boolean ans = bp(str);
        System.out.println(ans);
    }

    static boolean bp(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++)  
        { 
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')  
            {  
                s.add(str.charAt(i)); 
            } 
            else{
            if (s.isEmpty()==true) 
                return false;
            else if(matching(s.peek(),str.charAt(i))==false)
                return false;
            else
                s.pop();
            }
        }    
        return (s.isEmpty()==true); 
    }

    static boolean matching(char a, char b) {
        return (a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']');
    }
}