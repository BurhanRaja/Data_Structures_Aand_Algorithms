package com.Burhan;

import java.util.*;

public class String_Operators {
    public static void main(String[] args) {
        // The below code will print the adition of the values of char.
        System.out.println('a' + 'b');

        // If it is a string it will concatenate
        System.out.println("a" + "b");

        // It will print the 3rd letter after a i.e. d
        System.out.println((char)('a' + 3)); 

        // It will aagain concatenate the string with the list
        System.out.println("Burhan" + new ArrayList<>());

        // Same as above concatination
        Integer h = 56;
        System.out.println("Burhan" + h);

        // But here is the important point
        // You cannot print the below command without a string
        // System.out.println(new ArrayList<>() + h);
        // So,
        System.out.println(new ArrayList<>() + "" + h);

    }
}
