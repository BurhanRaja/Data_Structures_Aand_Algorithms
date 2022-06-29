package com.Burhan;

public class Insert_At_Begining_Singly_Linkedlist {
    public static void main(String[] args) {
        Node head = null;
        head = insertAtBegining(head, 30);
        head = insertAtBegining(head, 20);
        head = insertAtBegining(head, 10);

        printList(head);
    }
    static Node insertAtBegining(Node head, int x) {
        Node temp = new Node(x); // Assigning the temporary Node variable with integer
        temp.next = head; // making Node head a reference point for the temp i.e. null
        return temp;    
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