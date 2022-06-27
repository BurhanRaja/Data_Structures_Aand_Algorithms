package com.Burhan;

public class Singly_Linkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // printList(head);
        printListRecur(head);
    }

    // Iterative
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    // Recursive 
    static void printListRecur(Node head) {
        Node curr = head;
        if (curr == null) {
            return;
        }
        else {
            System.out.print(curr.data + " ");
        }
        printListRecur(curr.next);
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