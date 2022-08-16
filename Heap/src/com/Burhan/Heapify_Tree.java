package com.Burhan;

public class Heapify_Tree {

    static class MinHeap {
        int[] arr;
        int size, cap;

        MinHeap(int c) {
            cap=c;
            size=0;
            arr = new int[cap];
        }

        public int left(int i) {
            return (2*i+1);
        }
        public int right(int i) {
            return (2*i+2);
        }
        public int parent(int i) {
            return (i-1)/2;
        }

        public void insertNode(int x) {
            if (size == cap) {
                return;
            }
            size++;
            arr[size-1] = x;
            // Heapify Works if the below code is commented out
            for (int i = size-1; i != 0 && arr[parent(i)] > arr[i]; i = parent(i)) {
                swap(arr, i, parent(i));
            }
        }

        public void swap(int[]arr, int x, int y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }

        public void printArr() {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public void heapifyTree(int i) {

            int leftEl=left(i);
            int rightEl=right(i);
            int smallest=i;
    
            if (leftEl < size && arr[leftEl] < arr[i]) {
                smallest = leftEl;
            }
            if (rightEl < size && arr[rightEl] < arr[smallest]) {
                smallest = rightEl;
            }
    
            if (smallest != i) {
                swap(arr, smallest, i);
                heapifyTree(smallest);
            }
        }
    }

    public static void main(String[] args) {
        MinHeap mh = new MinHeap(10);
        mh.insertNode(40);
        mh.insertNode(20);
        mh.insertNode(30);
        mh.insertNode(35);
        mh.insertNode(25);
        mh.insertNode(80);
        mh.insertNode(32);
        mh.insertNode(100);
        mh.insertNode(70);
        mh.insertNode(60);

        mh.heapifyTree(0);

        mh.printArr();
    }

    static int left(int i) {
        return (2*i+1);
    }
    
    static int right(int i) {
        return (2*i+2);
    }

    static void swap(int[]arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
