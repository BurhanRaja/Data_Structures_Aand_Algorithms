package com.Burhan;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_tut {
    public static void main(String[] args) {
        
        // HashSet is used to store only keys
        HashSet<String> h = new HashSet<String>();
        
        h.add("Burhan");
        h.add("Zuzar");
        h.add("Sajeda");
        h.add("Raja");

        System.out.println(h);

        System.out.println(h.contains("BRaja")); // false
        System.out.println(h.contains("Raja")); // true

        Iterator<String> i = h.iterator();

        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }

        System.out.println();
        System.out.println(h.size());
        
        h.remove("Raja");

        for(String s : h) {
            System.out.print(s + " ");
        }
        
        System.out.println();

        h.clear(); // deletes all the elements
        System.out.println(h.isEmpty()); // checks if it is empty
    }
}

// Average time complexity = O(1)
// add()
// remove()
// contains()

// time complexity = O(1)
// size()
// isEmpty()