package com.Burhan;

public class Delete_At_Begining_Doubly_Linkedlist {
    public static void main(String[] args) {
        
    }

    static Node deleteNode(Node head) {
        if (head == null){
            return null;
        }
        if (head.next == null) {
            return null;
        }
        else{
            head.next = head;
            head.prev = null;
            return head;
        }
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
