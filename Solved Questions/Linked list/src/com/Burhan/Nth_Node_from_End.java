package com.Burhan;

public class Nth_Node_from_End {
    public static void main(String[] args) {
        Node head = new Node(10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);
        head = insertAtEnd(head, 50);
        head = insertAtEnd(head, 60);

        printList(head);
        System.out.println();
        // nthNode(head, 4);
        nthNode2(head, 4);
    }

    // Answer :- Naive
    static void nthNode(Node head, int n) {
        if (head == null) {
            return;
        }
        int count = 0;
        Node curr;

        for (curr = head; curr != null; curr=curr.next) {
            count++;
        }

        curr = head;
        for (int i=0; i < count-n; i++) {
            curr=curr.next;
        }
        
        System.out.println(curr.data);
    }

    // Answer2 :- Pointers
    static void nthNode2(Node head, int n) {
        if (head == null) {
            return;
        }

        Node second = head;
        Node first = head;

        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        while(first != null) {
            second = second.next;
            first = first.next;
        }

        System.out.println(second.data);
    }



    static Node insertAtEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        
        Node curr = head;
        while (curr.next != null) {
            curr=curr.next;
        }
        curr.next = temp;
        return head;
    }
    

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
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
