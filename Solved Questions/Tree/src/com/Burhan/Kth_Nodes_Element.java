package com.Burhan;

public class Kth_Nodes_Element {

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
        // root.left = new Node(20);
        // root.left.left = new Node(40);
        // root.left.right = new Node(50);
        // root.right = new Node(30);
        // root.right.right = new Node(70);

        // root.left = new Node(20);
        // root.left.left = new Node(30);

        root.left = new Node(6);
        root.right = new Node(8);
        root.right.right = new Node(7);
        root.right.right.left = new Node(11);
        root.right.right.right = new Node(12);
        
        kthElement(root, 3);

    }

    static void kthElement(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.key + " ");
        }
        else {
            kthElement(root.left, k-1);
            kthElement(root.right, k-1);
        }
    }
}
