package com.Burhan;

public class Circular_Linkelist_Traversal {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = head;
        // head.next.next = new Node(30);
        // head.next.next.next = head;

        printList(head);
        // alsoPrintList(head);

    }

    static void printList(Node head) {
        if (head == null) {
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
            if (curr.data == head.data) {
                break;
            }
        }
    }

    // OR

    // static void alsoPrintList(Node head) {
    //     if (head == null) {
    //         return;
    //     }
    //     System.out.print(head.data + " ");

    //     for (Node i = head.next; i != head; i = i.next) {
    //         System.out.print(i.data + " ");
    //     }
    // }

}

class Node {
    int data;
    Node next;

    Node (int x) {
        this.data = x;
        this.next = null;
    }
}