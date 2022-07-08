package com.Burhan;

public class Delete_At_Begining_Circular_Linkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        // head = deleteStart(head);
        head = delete(head);
        printList(head);
    }

    static Node deleteStart(Node head) {
        if (head == null) {
            return null;
        }
        else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = head.next;
            return curr.next;
            
        }
    }

    static Node delete(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head.next; // assign next data to temp
        head = temp; // copy the next data to head
        head.next = head.next.next; // connect the head to next of next
        return head; // return 
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

