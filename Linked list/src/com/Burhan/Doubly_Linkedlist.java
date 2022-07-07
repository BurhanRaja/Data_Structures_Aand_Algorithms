package com.Burhan;

public class Doubly_Linkedlist {
    public static void main(String[] args) {
        DoublyLinkedlist dList = new DoublyLinkedlist();
        dList.addNode(10);
        dList.addNode(20);
        dList.addNode(30);
        dList.addNode(40);
        dList.addNode(50);

        dList.printList();
    }

}

class DoublyLinkedlist {
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

    Node head, tail = null;  
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void printList()  {
        Node curr = head;

        while (curr.next != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
