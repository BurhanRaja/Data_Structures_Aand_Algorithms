package com.Burhan;

import java.util.LinkedList;
import java.util.Queue;

public class Level_order_Traversal {

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

        levelOrderTraversal(root);
    }

    static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        else {
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                Node curr = q.poll();
                System.out.print(curr.key + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }
}
