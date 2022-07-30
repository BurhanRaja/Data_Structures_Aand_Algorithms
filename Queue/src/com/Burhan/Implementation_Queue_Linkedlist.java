package com.Burhan;

public class Implementation_Queue_Linkedlist {
    static class Node{
        int data;
        Node next;
        Node (int x) {
            data = x;
            next = null;
        }
    }

    static class QueueLinkedlist{
        Node front;
        Node rear;

        QueueLinkedlist() {
            front = null;
            rear = null;
        }

        void enqueue(int x) {
            Node temp = new Node(x);

            if (front == null) {
                front = temp;
                rear = temp;
                return;
            }
            else {
                rear.next = temp;
                rear = rear.next;
            }
        }

        void dequeue(){
            if (front == null) {
                return;
            }
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }

        void printList() {
            Node curr = front;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }

    }

    public static void main(String[] args) {
        QueueLinkedlist q = new QueueLinkedlist();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.printList();
    }
}
