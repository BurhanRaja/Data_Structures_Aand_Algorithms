package com.Burhan;

public class Insert_At_End_Doubly_Linkedlist {
    public static void main(String[] args) {
        
    }

    static Node insertAtEnd(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            return temp;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }
}

class Node {
    int data;
    Node prev;
    Node next;

    Node (int x) {
        this.data = x;
        this.prev = null;
        this.next = null;
    }
}
