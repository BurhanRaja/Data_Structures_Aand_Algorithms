package com.Burhan;

import java.util.*;

public class Stack_ArrayList_Implementation {
    public static void main(String[] args) {
        
    }
}

class MyStack2 {
    ArrayList<Integer> list = new ArrayList<>();
    int top = -1;

    void push(int x) {
        list.add(x);
        top++;
    }
    void pop() {
        list.remove(top);
        top--;
    }
    int peek() {
        return list.get(top);
    }
    boolean isEmpty() {
        return (top == -1);
    }
    int size() {
        return list.size();
    }
}
