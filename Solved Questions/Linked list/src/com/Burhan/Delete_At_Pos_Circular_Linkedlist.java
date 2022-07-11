package com.Burhan;

public class Delete_At_Pos_Circular_Linkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        head = insert(head, 40);
        head = delete(head, 3);
        printList(head);
    }

    static Node delete(Node head, int k) {
        int i = 1;
        Node curr = head;

        // Till previous position 
        while(i <= k-2 && curr != null) {
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
    }

    static Node insert(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        else {
            temp.next = head.next;
            head.next = temp;

            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            return temp;
        }
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
}

class Node {
    int data;
    Node next;

    Node (int x) {
        this.data = x;
        this.next = null;
    }
}