package com.Burhan;

public class AND_Operator {
    public static void main(String[] args) {
        
        // int number1 = 7; // 0111
        // int number2 = 10; // 1010

        // This gives answer 0010 i.e. 2

        
        int number1 = 5; // 101
        int number2 = 7; // 111
        
        // This gives us the answer 101 i.e. 5 only
        
        System.out.println((number1&number2));
    }
}
