package com.Burhan;

import java.util.*;

public class Chanining {
    public static void main(String[] args) {

        MyHash hashing = new MyHash(2);
        hashing.insert(90);
        hashing.insert(20);
        hashing.insert(71);
        hashing.insert(89);
        hashing.insert(1);
        hashing.insert(123);
        hashing.insert(34);

        hashing.remove(34);
        hashing.printAll();


    // []
    // [71, 1]
    // []
    // []
    // [123]
    // [89]
    // [90, 20, 34]
    }
}

class MyHash {
    int Bucket;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b) {
        this.Bucket = b;
        this.table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            this.table.add(new LinkedList<Integer>());
        }
    }

    void insert(int key) {
        int i = key%Bucket;
        this.table.get(i).add(key);
    }
    void remove(int key) {
        int i = key%Bucket;
        this.table.get(i).remove((Integer) key);
    }
    boolean search(int key) {
        int i = key%Bucket;
        return this.table.get(i).contains(key);
    }

    void printAll() {
        for (int i = 0; i < this.table.size(); i++) {
            System.out.println(this.table.get(i));
        }
    }
}