package com.Burhan;

public class Linkedlist_Implementation {
    public static void main(String[] args) {
        // Creating the list with reference null
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        // Now linking the nodes by reference to other node
        head.next = temp1;
        temp1.next = temp2;
    }
}

// A simple implementation of Linkedlist

class Node {
    int data;
    Node next;

    Node (int x) {
        this.data = x;
        this.next = null;
    }
}