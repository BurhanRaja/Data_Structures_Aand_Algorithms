package com.Burhan;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Input {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // Input
        for (int i = 0; i < 5; i++) {
            list.add(inp.nextInt());
        }

        // Output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        inp.close();

    }
}
