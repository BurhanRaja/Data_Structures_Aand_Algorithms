package com.Burhan;

public class Insert_At_Begining_Doubly_Linkedlist {
    public static void main(String[] args) {
        Node dList = new Node(10);
        dList = addNode(dList, 20);
        dList = addNode(dList, 30);
        dList = addNode(dList, 40);

        dList = insertNode(dList, 50);
        printList(dList);

    }

    static Node addNode(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            head.prev = null;
            head.next = null;
        }
        else {
            Node newNode = new Node(data);
            head.next = newNode;
            newNode.prev = head;
        }
        return head;
    }

    static void printList(Node head)  {
        Node curr = head;

        while (curr.next != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    static Node insertNode(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        return temp;
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

