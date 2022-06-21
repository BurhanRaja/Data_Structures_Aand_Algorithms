package com.Burhan;

import java.util.Arrays;

public class Open_Add {
    public static void main(String[] args) {
        MyHashing list = new MyHashing(7);

        list.insert(9);
        list.insert(45);
        list.insert(56);
        list.insert(90);
        list.insert(12);
        list.insert(57);
        list.insert(89);

        list.delete(89);

        boolean value = list.search(50);
        System.out.println(value);

        list.printAll();
    }
}

// Assuming -1 nad -2 are not a part of the array
// -1 is for empty part and -2 is for deletion part
class MyHashing {
    int[] arr;
    int cap, size;

    MyHashing(int c) {
        this.cap = c;
        this.size = 0;
        this.arr = new int[cap];

        for (int i = 0; i < this.cap; i++) {
            this.arr[i] = -1;
        }
    }

    int hash(int key) {
        return key%cap;
    }

    boolean search(int key) {
        int h = hash(key);
        int i = h;
        while (this.arr[i] != -1) {
            if (this.arr[i] == key) {
                return true;
            }
            i = (i+1)%this.cap;

            if (i == h) {
                return false;
            }
        }
        return false;
    }

    void printAll() {
        System.out.println(Arrays.toString(this.arr));
    }

    boolean insert(int key) {
        if (this.size == this.cap) {
            return false;
        }
        int i = hash(key);

        while (this.arr[i] != -1 && this.arr[i] != -2 && this.arr[i] != key) {
            i = (i+1)%cap;
        }

        if (this.arr[i] == key) {
            return false;
        }
        else {
            this.arr[i] = key;
            this.size++;
            return true;
        }
    }

    boolean delete(int key) {
        int h = hash(key);
        int i = h;
        while (this.arr[i] != -1) {
            if (this.arr[i] == key) {
                arr[i] = -2;
                return true;
            }
            i = (i+1)%this.cap;

            if (i == h) {
                return false;
            }
        }
        return false;
    }
}
