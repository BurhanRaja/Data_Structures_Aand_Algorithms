package com.Burhan;

public class Search_Singly_Linkedlist {
    public static void main(String[] args) {
        Node head = new Node(100);
        head = insertAtEnd(head, 60);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 50);
        head = insertAtEnd(head, 70);
        head = insertAtEnd(head, 90);

        // int position = searchPos(head, 70);
        int position = searchPos2(head, 60, 1);
        System.out.println(position);
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

    // Iterative
    static int searchPos(Node head, int x) {
        if (head == null) {
            return -1;
        }
        Node curr = head;
        int count = 1;
        while (curr != null) {
            if (curr.data == x) {
                return count;
            }
            else {
                curr = curr.next;
                count++;
            }
        }
        
        return -1;
    }

    // Recursive
    static int searchPos2(Node head, int x, int count) {
        if (head == null) {
            return -1;
        }

        if (head.data == x) {
            return count;
        }
        else {
            return searchPos2(head.next, x, count+1);
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