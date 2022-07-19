package com.Burhan;

import java.util.ArrayList;

public class Reverse_Linkedlist {
    public static void main(String[] args) {
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        printList(head);

        System.out.println();
        // head = reverseLinkedlist(head);
        // head = reverseOneIter(head);
        // head = reverseRecursive(head);
        head = reverseRecursive2(head);
        printList(head);
    }

    // Reverse with Two Iteration
    static Node1 reverseLinkedlist(Node1 head) {
        Node1 curr; 
        ArrayList<Integer> list = new ArrayList<>();
        for (curr = head; curr!=null; curr=curr.next) {
            list.add(curr.data);
        }
        for (curr = head; curr!=null; curr=curr.next) {
            curr.data = list.get(list.size()-1);
            list.remove(list.size()-1);
        }
        return head;
    }

    // Reverse in one iteration
    static Node1 reverseOneIter(Node1 head) {
        Node1 prev = null;
        Node1 curr = head;
        while (curr != null) {
            Node1 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Reverse Recursive
    static Node1 prev = null;
    static Node1 reverseRecursive(Node1 curr) {
        if (curr == null) {
            return prev;
        }
        else {
            Node1 next = curr.next;
            curr.next = prev;
            prev = curr;
            return reverseRecursive(next);
        }
    }

    static Node1 reverseRecursive2(Node1 head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node1 restHead = reverseRecursive2(head.next);
        Node1 restTail = head.next;
        restTail.next = head;
        head.next = null;
        return restHead;
    }

    static void printList(Node1 head) {
        Node1 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

class Node1 {
    int data;
    Node1 next;
    public com.Burhan.Node1 prev;

    Node1 (int x) {
        this.data = x;
        this.next = null;
    }
}
