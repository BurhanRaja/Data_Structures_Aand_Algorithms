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
}
