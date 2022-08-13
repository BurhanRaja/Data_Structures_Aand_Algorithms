package com.Burhan;

public class Delete_BST {

    static class Node{
        int key;
        Node left;
        Node right;

        Node(int x) {
            key = x;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.right = new Node(40);

        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        Node answer = bstDelete(root, 30);
        inorderTraversal(answer);
    }

    // Three cases
    // 1. To delete Node at last
    // 2. To delete Node from the middle and connect the next Node to the previous Node
    // 3. To delete root and replacing it with an inorder successor
    static Node bstDelete(Node root, int x) {
        if (root == null) {
            return null;
        }
        if (root.key > x) {
            root.left = bstDelete(root.left, x);
        }
        else if (root.key < x) {
            root.right = bstDelete(root.right, x);
        }
        else {
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            else{
                Node successor = getSuccessor(root);
                root.key = successor.key;
                root.right = bstDelete(root.right, successor.key);
            }
        }

        return root;
    }

    static Node getSuccessor(Node root) {
        Node curr = root.right;
        while(curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.println(root.key);
            inorderTraversal(root.right);
        }
    }
}
