package com.Burhan;

public class Insert_At_End_Singly_Linkedlist {
    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 10); // 10
        head = insertAtEnd(head, 20); // 10 20
        head = insertAtEnd(head, 30); // 10 20 30
        head = insertAtEnd(head, 40); // 10 20 30 40

        printList(head);

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
