package com.Burhan;

import java.util.*;

public class Frequency_of_Element {
    public static void main(String[] args) {
        Integer[] arr = {10,12,10,15,10,20,12,12};
        frequencyElement(arr);
    }

    static void frequencyEl(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;

            // To check whether the elements before arr[i] are not same
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            // If flag is true continue and go up
            if (flag) {
                continue;
            }

            // To count the number if it is unique and flag is false
            int freq = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }

            System.out.println(arr[i] + " = " + freq);
        }
    }

    // Also Can be done like this
    static void frequencyElem(Integer[] arr) {
        HashSet<Integer> l = new HashSet<>(Arrays.asList(arr));
        
        for (Integer s: l) {
            int count = 0 ;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == s) {
                    count++;
                }
            }

            System.out.println(s + " = " + count);
        }
    }

    // Both the above solution are O(n^2)

    // Efficient Soln 
    // Complexity = theta(n)
    static void frequencyElement(Integer[] arr) {
        HashMap<Integer, Integer> l = new HashMap<>();

        for (Integer x: arr) {
            l.put(x, l.getOrDefault(x, 0)+1);
        }

        System.out.println(l);
    }
}
