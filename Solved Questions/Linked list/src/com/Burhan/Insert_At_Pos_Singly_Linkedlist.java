package com.Burhan;

public class Insert_At_Pos_Singly_Linkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);
        head = insertAtEnd(head, 50);

        inssertAtPos(head, 4, 45);
        
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

    static Node inssertAtPos(Node head, int pos, int data) {
        int i = 1;
        Node curr = head;

        // Till previous position 
        while(i <= pos-2 && curr != null) {
            curr = curr.next;
            i++;
        }

        if (curr == null) {
            return head;
        }

        Node temp = new Node(data); // Created a Node of data
        temp.next = curr.next; // Connected the Node temp.next with the curr.next Node
        curr.next = temp; // again reconnecting the Node curr.next with temp

        return curr;
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
