package com.Burhan;

public class Stack_Array_Implementation {
    public static void main(String[] args) {
        MyStack newStack = new MyStack(10);

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        System.out.println(newStack.size());

        newStack.pop();
        System.out.println(newStack.size());

        newStack.pop();
        newStack.pop();
        
        System.out.println(newStack.size());
        
        newStack.pop();
    }
}

// Disadvantages:-
// It does not handle overflow and underflow
// Noo Dynamic Resizing

// Handled the first disadvantages

class MyStack {
    int[] arr;
    int top;
    int cap;

    MyStack (int x) {
        top = -1;
        cap = x;
        arr = new int[cap];
    }

    void push(int y) {
        if (top+1 == cap) {
            try {
                throw new Exception("The is size of an array is full");
            } catch (Exception e) {
                e.printStackTrace();
            } 
        }
        else {
            top++;
            arr[top] = y;
        }
    }

    int pop() {
        if (top == -1){
            try {
                throw new Exception("The array is Empty.");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return -1;
        }
        else {
            int res = arr[top];
            top--;
            return res;
        }
    }

    int peek() {
        if (top == -1){
            try {
                throw new Exception("The array is Empty.");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return -1;
        }
        else {
            return arr[top];
        }
    }

    int size() {
        return top+1;
    }

    boolean isEmpty() {
        return (top == -1);
    }

}