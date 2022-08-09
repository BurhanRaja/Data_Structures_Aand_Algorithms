package com.Burhan;

public class Height_of_Tree {

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
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        int height = heightTree(root);
        System.out.println(height);
    }

    static int heightTree(Node root) {
        if (root == null) {
            return 0;
        }
        else {
            return Math.max(heightTree(root.left), heightTree(root.right)) + 1;
        }
    }
}