package com.Burhan;

public class Floor_BST {

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
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        root.right.left.left = new Node(55);
        root.right.left.right = new Node(65);

        Node ans = bstFloor(root, 58);
        System.out.println(ans.key);        
    }

    static Node bstFloor(Node root, int x) {
        Node res = null;
        while (root != null) {
            if (root.key < x) {
                res = root;
                root = root.right;
            }
            else if (root.key > x) {
                root = root.left;
            }
            else {
                return root;
            }
        }
        return res;
    }
}
