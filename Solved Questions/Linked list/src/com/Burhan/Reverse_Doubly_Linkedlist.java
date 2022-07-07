package com.Burhan;

public class Reverse_Doubly_Linkedlist {
    public static void main(String[] args) {
        
    }

    // Reverse of Doubly Linkedlist is remaining 

    static void reverseDoublyLinkedlist(Node head) {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        while (curr.prev != null) {
            System.out.print(curr.data);
            curr=curr.prev;
        }
    }
}

class Node {
    int data;
    Node prev;
    Node next;

    Node (int x) {
        this.data = x;
        this.prev = null;
        this.next = null;
    }
}
