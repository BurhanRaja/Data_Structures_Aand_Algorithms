package com.Burhan;

public class Build_Heap {

    static class MinHeap {
        int[] arr;
        int size, cap;

        MinHeap(int c) {
            cap=c;
            size=0;
            arr = new int[cap];
        }

        public int size() {
            return size-1;
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
            // for (int i = size-1; i != 0 && arr[parent(i)] > arr[i]; i = parent(i)) {
            //     swap(arr, i, parent(i));
            // }
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

        // O(h)
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

        public int getMin() {
            if (size == 0) {
                return -1;
            }
            if (size ==1) {
                return arr[0];
            }
            swap(arr, 0, size-1);
            size--;
            heapifyTree(0);
            return arr[size];
        }

        // O(logn)
        public void decreaseKey(int i, int x) {
            arr[i] = x;
            for (int j = i; j != 0 && arr[parent(j)] > arr[j]; j=parent(j)) {
                swap(arr, j, parent(j));
            }
        }

        // O(logn)
        public void deleteKey(int i) {
            int minKey= Integer.MIN_VALUE;
            decreaseKey(i, minKey);
            getMin();
        }

        public void buildHeap() {
            for (int i = parent(size-1); i >= 0; i--) {
                heapifyTree(i);
            }
        }
    }

    public static void main(String[] args) {
        // 10, 4, 50, 15, 20
        MinHeap mh = new MinHeap(5);
        mh.insertNode(10);
        mh.insertNode(15);
        mh.insertNode(50);
        mh.insertNode(4);
        mh.insertNode(20);

        mh.buildHeap();

        mh.printArr();
    }
}
