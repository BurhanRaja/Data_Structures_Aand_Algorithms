package com.Burhan;

public class Circular_Linkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
    }
}

class Node {
    int data;
    Node next;
    Node (int x) {
        this.data = x;
        this.next = null;
    }
}
