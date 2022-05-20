package com.Burhan;

public class Left_Shift_Operator {
    public static void main(String[] args) {
        int num = 5; // 101
        // 5 << 1 :- The answer will be 1010 i.e. 10. 
        // The 1 is shift one step towards left i.e. if <<1.
        
        // If <<2 then the 1 will shift two steps towards left.
        // 5 << 2 :- The answer will be 10100 i.e. 20.

        // As the number increases <<i, i++, then the number of shifts towards left will also increase
    
        System.out.println((5<<2));
    }
}
