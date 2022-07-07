package com.Burhan;

public class Insert_At_Begining_Doubly_Linkedlist {
    public static void main(String[] args) {
        Node dList = new Node(10);
        dList = insertNode(dList, 20);
        dList = insertNode(dList, 50);
        
        printList(dList);

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
        temp.prev = null;
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

