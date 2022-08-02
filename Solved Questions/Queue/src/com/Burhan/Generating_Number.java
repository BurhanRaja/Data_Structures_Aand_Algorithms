package com.Burhan;

import java.util.*;

public class Generating_Number {
    public static void main(String[] args) {
        generateNum(10);
    }

    static void generateNum(int n){
        Queue<String> q = new ArrayDeque<>();
        q.add("5");
        q.add("6");
        for (int i = 0; i < n; i++) {
            String curr = q.remove();
            System.out.println(curr);
            q.add(curr + "5");
            q.add(curr + "6");
        }
    }
}
