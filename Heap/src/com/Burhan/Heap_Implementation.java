package com.Burhan;

public class Heap_Implementation {

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

    }

    public static void main(String[] args) {
        
    }
}