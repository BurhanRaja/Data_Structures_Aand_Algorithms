package com.Burhan;

public class Search_BST {

    static class Node {
        int key;
        Node left;
        Node right;

        Node(int k) {
            key = k;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);

        root.right = new Node(20);
        root.right.right = new Node(80);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);

        boolean ans = bstSearch(root, 14);
        System.out.println(ans);
    }

    // TC:- O(h)
    // AS:- O(h)
    static boolean bstSearch(Node root, int x) {
        if (root == null) {
            return false;
        } 
        else if (root.key == x) {
            return true;
        }
        else if (x > root.key) {
            return bstSearch(root.right, x);
        } else {
            return bstSearch(root.left, x);
        }
    }

    
    // Iterative
    static boolean iterativeBSTSearch(Node root, int x) {
        while (root != null) {
            if (root.key == x) {
                return true;
            }
            else if (root.key < x) {
                root = root.right;
            }
            else {
                root = root.left;
            }
        }
        return false;
    }
}