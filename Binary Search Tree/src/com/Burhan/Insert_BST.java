package com.Burhan;

public class Insert_BST {

    static class Node{
        int key;
        Node left;
        Node right;

        Node(int x) {
            key = x;
        }
    }

    public static void main(String[] args) {
        
    }

    static Node bstInsert(Node root, int x) {
        if (root == null) {
            return new Node(x);
        }
        else if (x > root.key) {
            root.right = bstInsert(root.right, x);
        }
        else {
            root.left = bstInsert(root.left, x);
        }
        return root;
    }

    // Iterative
    static Node iterativeBSTInsert(Node root, int x) {
        Node temp = new Node(x);
        Node parent = null;
        Node curr = root;

        while (curr != null) {
            parent = curr;
            if (curr.key < x) {
                curr = curr.right;
            }
            else if(curr.key > x){
                curr = curr.left;
            }
            else {
                return root;
            }
        }

        // When root == null
        if (parent == null) {
            return temp;
        }

        if (parent.key < temp.key) {
            parent.right = temp;
        }
        else {
            parent.left = temp;
        }

        return root;
    }
}
