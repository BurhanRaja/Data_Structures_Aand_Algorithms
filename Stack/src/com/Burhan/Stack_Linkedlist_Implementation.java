package com.Burhan;

public class Stack_Linkedlist_Implementation {
    public static void main(String[] args) {
        MyStack3 newStack = new MyStack3();
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);

        System.out.println(newStack.size());
        
        System.out.println(newStack.pop());
        
        System.out.println(newStack.size());
    }
}

class Node {
    int data;
    Node next;

    Node (int x) {
        data = x;
        next = null;
    }
}

class MyStack3 {
    Node head;
    int size;
    MyStack3() {
        head = null;
        size = 0;
    }
    
    int size() {
        return size;
    }

    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop() {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        else {
            int res = head.data;
            head = head.next;
            size--;
            return res;
        }
    }

    int peek() {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        else {
            return head.data;
        }
    }

    boolean isEmpty() {
        return (size == 0);
    }

}