package com.Burhan;

public class Sorted_Insert {

    static class Node{
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // head = sortedInsert(head, 41);
        // head = sortedInsert(head, 49);
        // head = sortedInsert(head, 17);
        // head = sortedInsert(head, 5);

        head = sortInsert(head, 41);
        head = sortInsert(head, 49);
        head = sortInsert(head, 17);
        head = sortInsert(head, 5);
        printNode(head);
    }

    // Time Complexity theta(pos)
    
    // Naive Solution 
    static Node sortedInsert(Node head, int x) {
        Node temp = new Node(x);
        
        if (head == null) {
            return temp;
        }
        
        if (head.data > x) {
            temp.next = head;
            return temp;
        }

        Node prev = null;
        Node curr = head;
        while (curr != null) {
            if (curr.data >= x) {
                prev.next = temp;
                temp.next = curr;
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        return head;
    }

    // Efficient Solution

    static Node sortInsert(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        
        if (head.data > x) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data < x) {
            curr = curr.next;
        }

        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    static void printNode(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }
}