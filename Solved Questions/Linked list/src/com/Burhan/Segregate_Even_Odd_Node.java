package com.Burhan;

public class Segregate_Even_Odd_Node {
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
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);

        segregate(head);
        // printList(head);
    }


    static void segregate(Node head) {
        Node eS = null; // even start
        Node oS = null; // odd start
        Node eE = null; // even end
        Node oE = null; // odd end

        Node curr = head;

        while (curr != null) {
            if (curr.data%2 == 0) {
                if (eS == null) {
                    eS = curr;
                    eE = eS;
                }
                else {
                    eE.next = curr;
                    eE = eE.next;
                }
            }
            else {
                if (oS == null) {
                    oS = curr;
                    oE = oS;
                }
                else {
                    oE.next = curr;
                    oE = oE.next;
                }
            }

            curr = curr.next;
            
        }

        if (eS == null || oS == null) {
            printList(head);
        }
        else {
            eE.next = oS;
            oE.next = null;
        }
        printList(eS);
    }

    static Node deleteNode(Node head) {
        if (head == null) {
            return null;
        }

        else {
            return head.next;
        }
    }


    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
