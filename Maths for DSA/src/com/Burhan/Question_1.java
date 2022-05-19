// Given a number, find whether it is odd or even

package com.Burhan;

import java.util.*;

public class Question_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number = inp.nextInt();

        if ((number&1) == 1) {
            System.out.println("ODD");
        }
        else {
            System.out.println("EVEN");
        }

        inp.close();
    }
}