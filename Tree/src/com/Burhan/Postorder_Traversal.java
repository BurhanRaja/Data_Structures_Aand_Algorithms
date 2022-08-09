package com.Burhan;

public class Postorder_Traversal {

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
        root.left.right = new Node(50);
        root.right.left = new Node(60);

        inOrderTraversal(root);
    }

    // Time Complexity O(n)
    // Left Root Right
    static void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
            System.out.print(root.key + " ");
        }
    }
}
