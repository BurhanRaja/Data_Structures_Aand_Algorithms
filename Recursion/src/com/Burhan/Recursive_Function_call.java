package com.Burhan;

public class Recursive_Function_call {
    public static void main(String[] args) {
        printNum(1);
    }

    static void printNum(int n) {
        // Base Condition to stop the program at given number
        if (n == 5) {
            System.out.println(n);
            return;
        }
        // To print the number
        System.out.println(n);

        // Calling function itself
        printNum(n+1);
    }
}
