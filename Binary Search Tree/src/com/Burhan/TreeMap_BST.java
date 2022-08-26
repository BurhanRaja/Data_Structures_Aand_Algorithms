package com.Burhan;

import java.util.TreeMap;

public class TreeMap_BST {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        
        tm.put(1, "Burhan");
        tm.put(2, "Zuzar");
        tm.put(3, "Sajeda");
        tm.put(4, "Raja");

        tm.remove(4);
        tm.containsValue("Burhan");

        System.out.println(tm.ceilingKey(2) + " " + tm.floorKey(3) + " " + tm.lowerKey(1) + " " + tm.higherKey(1));

        System.out.println();

        System.out.println(tm.ceilingEntry(2).getValue() + " " + tm.floorEntry(3).getValue() + " " + tm.lowerEntry(2).getValue() + " " + tm.higherEntry(2).getValue());
    }
}
