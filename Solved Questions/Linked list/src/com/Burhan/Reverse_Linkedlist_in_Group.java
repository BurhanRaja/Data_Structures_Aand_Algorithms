package com.Burhan;

public class Reverse_Linkedlist_in_Group {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        printList(head);

        head = reverseGroup(head, 3);

        System.out.println();
        printList(head);
    }

    static Node reverseGroup(Node head, int k) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            Node rest_head = reverseGroup(next, k);
            head.next = rest_head;
        }
        return prev;
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
        data = x;
        next = null;
    }
}
