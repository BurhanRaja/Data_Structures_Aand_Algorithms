package com.Burhan;

// This is how binary tree is created
public class Binary_Tree {

    static class Node{
        int key;
        Node left;
        Node right;
        Node(int k) {
            key = k;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
    }
}