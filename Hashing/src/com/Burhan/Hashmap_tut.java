package com.Burhan;

import java.util.*;

public class Hashmap_tut {
    public static void main(String[] args) {
        // HashMap is used to store key and their values
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        list.put("Burhan", 52);
        list.put("Zuzar", 51);
        list.put("Sajeda", 50);
        list.put("Raja", 153);

        System.out.println(list);
        System.out.println(list.size());

        for (Map.Entry<String, Integer> e: list.entrySet()) {
            System.out.print(e.getKey() + " " + e.getValue() + "  ");
        }

        System.out.println();

        if (list.containsKey("Raja")) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        list.remove("Burhan");
        System.out.println(list);
    }
}
