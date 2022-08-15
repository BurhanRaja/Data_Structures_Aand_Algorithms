package com.Burhan;

public class Size_of_BinaryTree {

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
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        root.right.right = new Node(70);

        int ans = sizeBinaryTree(root);
        System.out.println(ans);
    }

    static int sizeBinaryTree(Node root){
        if (root == null) {
            return 0;
        }
        else {
            return 1 + sizeBinaryTree(root.left) + sizeBinaryTree(root.right);
        }
    }
}
