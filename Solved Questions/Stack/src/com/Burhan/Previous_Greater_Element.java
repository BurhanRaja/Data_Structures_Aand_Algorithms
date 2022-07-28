package com.Burhan;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Previous_Greater_Element {
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 1, 5, 6};
        int[] ans = prevGreater(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] prevGreater(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        int[] ans = new int[arr.length];
        int length = 1;

        s.push(0);
        ans[0] = -1;

        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[length] = -1;
                length++;
            }
            else {
                ans[length] = arr[s.peek()];
                length++;
            }
            
            s.push(i);
        }

        return ans; 
    }
}
