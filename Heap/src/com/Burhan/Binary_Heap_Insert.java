package com.Burhan;

public class Binary_Heap_Insert {

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
    }

    public static void main(String[] args) {
        MinHeap mh = new MinHeap(10);
        mh.insertNode(10);
        mh.insertNode(20);
        mh.insertNode(30);
        mh.insertNode(45);
        mh.insertNode(67);
        mh.insertNode(89);
        mh.insertNode(12);

        mh.printArr();
    }
}
