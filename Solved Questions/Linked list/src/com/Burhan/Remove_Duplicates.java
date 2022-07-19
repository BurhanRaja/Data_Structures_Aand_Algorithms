package com.Burhan;

public class Remove_Duplicates {
    public static void main(String[] args) {
        Node2 head = new Node2(10);
        head.next = new Node2(20);
        head.next.next = new Node2(20);
        head.next.next.next = new Node2(30);
        head.next.next.next.next = new Node2(30);

        head = removeDup(head);
        printList(head);
    }

    static Node2 removeDup(Node2 head) {
        Node2 curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }

    static void printList(Node2 head) {
        Node2 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

class Node2 {
    int data;
    Node2 next;

    Node2 (int x) {
        data = x;
        next = null;
    }
}
