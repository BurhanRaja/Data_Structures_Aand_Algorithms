package com.Burhan;

public class Array_Implementation_Deque {

    // Simple Implementation
    static class Deque {
        int[] arr;
        int front, rear, cap, size;

        Deque(int c) {
            cap = c;
            arr = new int[cap];
            front = 0;
            size = 0;
        }

        boolean isFull() {
            return size == cap;
        }
        boolean isEmpty() {
            return size == 0;
        }

        void insertFront(int x){
            if (isFull()) {
                return;
            }
            if (size < cap) {
                for (int i = size-1; i >= 0; i--) {
                    arr[i+1] = arr[i];
                }
                arr[front] = x;
                size++;
            }
        }
        void insertRear(int x) {
            if (isFull()) {
                return;
            }
            arr[size] = x;
            size++;
        }


        void deleteFront() {
            if (isEmpty()) {
                return;
            }

            for (int i = 0; i < size-1; i++) {
                arr[i] = arr[i+1];
            }

            size--;
            arr[size] = 0;
        }
        void deleteRear() {
            if (isEmpty()) {
                return;
            }
            arr[size-1] = 0;
            size--;
        }

        int getFront(){
            if (isEmpty()) {
                return -1;
            }
            else {
                return arr[0];
            }
        }
        int getRear() {
            if (isEmpty()) {
                return -1;
            }
            else{
                return arr[size-1];
            }
        }

        int size() {
            return size;
        }
    }

    // Circular Array
    static class DequeEff {
        int[] arr; 
        int front, size, cap;

        DequeEff(int c) {
            cap = c;
            size = 0;
            front = 0;
        }

        boolean isFull() {
            return size == cap;
        }
        boolean isEmpty() {
            return size == 0;
        }

        void insertFront(int x){
            if (isFull()) {
                return;
            }
            front = (front-1+cap)%cap;
            arr[front] = x;
            size++;
        }
        void insertRear(int x) {
            if (isFull()) {
                return;
            }
            int rear = (front+size)%cap;
            rear = (rear-1+cap)%cap;
            arr[rear] = x;
            size++;
        }


        void deleteFront() {
            if (isEmpty()) {
                return;
            }
            front = (front+1)%cap;
            size--;
        }
        void deleteRear() {
            if (isEmpty()) {
                return;
            }
            int rear = (front+size)%cap;
            rear = (rear+1)%cap;
            size--;
        }


    }   

    public static void main(String[] args) {
        System.out.println(7%4);
    }
}