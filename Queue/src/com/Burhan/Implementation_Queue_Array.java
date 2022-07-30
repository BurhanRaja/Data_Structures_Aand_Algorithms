package com.Burhan;

public class Implementation_Queue_Array {

    static class MyQueue {
        int[] arr;
        int size, cap;

        MyQueue (int c) {
            cap = c;
            size = 0;
            arr = new int[cap];
        }

        void enqueue(int x) {
            if (isFull()) {
                return;
            }
            arr[size] = x;
            size++;
        }
        void dequeue() {
            if (isEmpty()) {
                return;
            }
            int i = 0;
            for (i = 0; i < cap; i++) {
                arr[i] = arr[i+1];
            }
            arr[cap-1] = 0;
            size--;
        }
        int getFront() {
            if (isEmpty()) {
                return -1;
            }
            return arr[0];
        }
        int getRear() {
            if (isEmpty()) {
                return -1;
            }
            return arr[size];
        }
        boolean isFull() {
            return size==cap;
        }
        boolean isEmpty(){
            return size==0;
        }
    }

    // Cicular Implementation
    static class Queue{
        int[] arr;
        int size, cap, front;

        Queue(int c) {
            cap = c;
            size = 0;
            front = 0;
            arr = new int[cap];
        }

        boolean isFull() {
            return size==cap;
        }
        boolean isEmpty(){
            return size==0;
        }
        int getFront() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }
        int getRear() {
            if (isEmpty()) {
                return -1;
            }
            return (front + size - 1)%cap;
        }
        void enqueue(int x) {
            if (isFull()) {
                return;
            }
            int rear = getRear();
            rear = (rear + 1)%cap;
            arr[rear] = x;
            size++;
        }

        void dequeue() {
            if (isEmpty()) {
                return;
            }
            front = (front+1)%cap;
            size--;
        }

    }
}

