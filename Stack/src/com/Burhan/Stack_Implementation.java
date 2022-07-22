package com.Burhan;

import java.util.*;

public class Stack_Implementation {
    public static void main(String[] args) {
        // These both are same but Stack class inherits from Vector class, also called legacy class means present before collection class, is a thread safe class which can cause extra overhead in single thread env.

        // Stack<Integer> s = new Stack<>();
        
        ArrayDeque<Integer> s = new ArrayDeque<>(); // used for single thread environment
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.contains(30));

        s.pop();

        System.out.println(s.peek());

        System.out.println(s.isEmpty());
    }
}