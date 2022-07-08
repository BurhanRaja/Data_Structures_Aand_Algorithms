package com.Burhan;

public class Insert_At_Begining_Circular_Linkelist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        // head = insert(head, 5);
        head = insertNode(head, 5);
        printList(head);

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

    // Naive Solution
    static Node insert(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        }

        else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
            return temp;
        }
    }

    static Node insertNode(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        else {
            // Adding a Node after head
            temp.next = head.next;
            head.next = temp;

            // Swapping the first two Nodes
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            return head;
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