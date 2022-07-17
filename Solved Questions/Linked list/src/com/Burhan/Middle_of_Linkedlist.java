package com.Burhan;

public class Middle_of_Linkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);

        printList(head);
        System.out.println();
        MiddleNode(head);
        middleNode(head);
    }

    // Answer :- Naive
    static void MiddleNode(Node head) {
        if (head == null) {
            return;
        }
        int count = 0;
        Node curr;

        for (curr = head; curr != null; curr=curr.next) {
            count++;
        }

        curr = head;
        for (int i = 0; i < count/2; i++) {
            curr= curr.next;
        }
        System.out.println(curr.data);
    }

    // Answer:- Efficient
    static void middleNode(Node head) {
        if (head == null) {
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);
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