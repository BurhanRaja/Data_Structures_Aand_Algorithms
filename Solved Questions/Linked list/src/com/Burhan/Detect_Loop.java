package com.Burhan;

import java.util.HashSet;

class Detect_Loop {

    static class Node {
        int data;
        int flag;
        Node next;

        Node(int x) {
            data = x;
            flag = 0;
            next = null;
        }
    }

    public static void main(String[] args) {

        // Start with the empty list
        Node head = null;

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // System.out.println(detectLoopNaive(head));
        System.out.println(detectLoop(head));
        // System.out.println(detectLoop2(head));
        // System.out.println(detectLoop3(head));
    }

    // Using Flag
    static String detectLoopNaive(Node head) {

        while (head != null) {
            if (head.flag == 1) {
                return "Yes";
            } else {
                head.flag = 1;
            }
            head = head.next;
        }
        return "No";
    }

    // Using slow and fast :- Floyd's Loop Detection
    static boolean detectLoop(Node head) {
        if (head == null) {
            return (Boolean) null;
        }
        Node slow = head;
        Node fast = head;

        while (fast.next != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow.data == fast.data) {
                return true;
            } 
        }

        return false;
    }

    // Using dummy Node
    static boolean detectLoop2(Node head) {
        Node temp = new Node(-1);

        while (head != null) {
            if (head.next.data == temp.data) {
                return true;
            }
            Node next = head.next;
            head.next = temp;
            head = next;
        }

        return false;
    }

    // Using Hashing
    static boolean detectLoop3(Node head) {
        HashSet<Integer> h = new HashSet<>();

        while (head != null) {
            if (h.contains(head.data)) {
                return true;
            }
            
            h.add(head.data);
            head = head.next;
        }

        return false;
    }
}
