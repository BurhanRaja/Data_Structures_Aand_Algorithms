package com.Burhan;

public class Detect_Remove_Loop {
    static class Node {
        int data;
        Node next;
        int flag;
        Node (int x) {
            data = x;
            next = null;
            flag = 0;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        // head.next = head;
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head.next.next;


        // head = detectRemove(head);
        head = detectAndRemove(head);

        printList(head);
    }

    // Using Floyd Cycle Detection
    static Node detectAndRemove(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow.data == fast.data) {
                break;
            }
        }
        return head;
    }

    // Another version
    static Node detectAndNode2(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                break;
            }
        }
        if (slow != fast) {
            return head;
        }

        while(slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;
        
        return head;
    }

    // Using Flag
    static Node detectRemove(Node head) {

        if (head == null) {
            return null;
        }

        Node curr = head;

        while (curr != null) {
            if (curr.next.flag == 1) {
                curr.next = null;
            }
            
            curr.flag = 1;
            curr = curr.next;
        }
        return head;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
