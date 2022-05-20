package com.Burhan.Add_Binary;

import java.math.*;

public class Add_Binary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String ans = addBinary(a, b);
        System.out.println(ans);
        // addBinary(a, b);
    }

    static String addBinary(String a, String b) {

        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        BigInteger sum = num1.add(num2);

        return sum.toString(2);
    }
}