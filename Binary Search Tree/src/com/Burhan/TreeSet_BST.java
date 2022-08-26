package com.Burhan;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_BST {
    public static void main(String[] args) {

        // Uses Red Black Tree

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(60);
        ts.add(100);
        ts.add(30);
        ts.add(70);

        System.out.println(ts.contains(30));

        Iterator<Integer> iT = ts.iterator();

        while (iT.hasNext()) {
            System.out.println(iT.next());
        }


        ts.remove(60);

        for (Integer x : ts) {
            System.out.print(x + " ");
        }

        System.out.println();

        System.out.println(ts.lower(30));
        System.out.println(ts.higher(30));
        System.out.println(ts.floor(39));
        System.out.println(ts.ceiling(90));

    }
}