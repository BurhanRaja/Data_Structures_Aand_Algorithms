package com.Burhan;

public class Delete_Node_One_Pointer {
    static class Node {
        int data;
        int flag;
        Node next;

        Node(int x) {
            data = x;
            flag = 0;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        head = deleteNode(head);

        printList(head);
    }

    static Node deleteNode(Node head) {
        Node ptr = head.next.next;
        ptr.data = ptr.next.data;
        ptr.next = ptr.next.next;

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


