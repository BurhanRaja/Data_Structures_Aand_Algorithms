package com.Burhan;

import java.util.LinkedList;
import java.util.Queue;

public class Maximum_in_Tree {

    static class Node{
        int key;
        Node left;
        Node right;
        Node(int k) {
            key = k;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(70);

        int ans = getMaxLevel(root);
        System.out.println(ans);

    }

    // O(n)
    // Better for Perfect Binary Tree
    static int getMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return Math.max(root.key, Math.max(getMax(root.right), getMax(root.left)));
        }
    }

    // Using Level Order
    // O(n)
    static int getMaxLevel(Node root) {
        int max = Integer.MIN_VALUE;
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            Queue<Node> q= new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                Node curr = q.poll();
                max = Math.max(max, curr.key);

                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            return max;
        }
    }
}