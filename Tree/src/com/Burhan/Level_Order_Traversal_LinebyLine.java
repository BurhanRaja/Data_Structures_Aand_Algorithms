package com.Burhan;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal_LinebyLine {

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
        root.left = new Node(15);
        root.left.left = new Node(30);

        root.right = new Node(20);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.left.left = new Node(60);
        root.right.left.right = new Node(70);

        // levelOrderTrav(root);
        levelOrder(root);
    }

    static void levelOrderTrav(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (q.size() > 1) {
            Node curr = q.poll();
            if (curr == null){
                System.out.println();
                q.add(null);
                continue;
            }
            
            System.out.print(curr.key +" ");
            if (curr.left != null) {
                q.add(curr.left);
            }
            
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }

    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int count = q.size();
            // Not taking q.size() directly because the size of the q will continuously keep changing
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                System.out.print(curr.key + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            if (q.size() >0) {
                System.out.println();
            }
        }
    }
} 
