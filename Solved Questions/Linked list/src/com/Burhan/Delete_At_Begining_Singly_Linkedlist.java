package com.Burhan;

public class Delete_At_Begining_Singly_Linkedlist {
    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 10); // 10
        head = insertAtEnd(head, 20); // 10 20
        head = insertAtEnd(head, 30); // 10 20 30
        head = insertAtEnd(head, 40); // 10 20 30 40

        // printList(head); 
        
        
        head = deleteNode(head);
        head = deleteNode(head);
        printList(head);

    }
    
    // Insert
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

    static Node deleteNode(Node head) {
        if (head == null) {
            return null;
        }
        // Node temp = head.next;
        // head = null;
        // return temp;

        else {
            return head.next;
        }
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
