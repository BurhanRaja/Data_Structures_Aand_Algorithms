package com.Burhan;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_MultiD {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initializing an arraylist in an arraylist
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
        }

        // Inputing number
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(inp.nextInt());
            }
        }

        System.out.println(list);
    }
}
