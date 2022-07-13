package com.Burhan;

public class Sorted_Insert_Linked_List {
    public static void main(String[] args) {
        Node head = new Node(10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 50);

        int num = 40;

        head = insertSort(head, num);
        printList(head);
    }


    // Answer
    static Node insertSort(Node head, int num) {
        Node temp = new Node(num);
        if (head == null) {
            return temp;
        }

        if (num < head.data) {
            temp.next = head;
            return temp;
        }

        Node curr = head;
        while (curr.next != null && curr.next.data < num) {
            curr=curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
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
