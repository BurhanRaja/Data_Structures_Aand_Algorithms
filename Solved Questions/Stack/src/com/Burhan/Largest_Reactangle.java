package com.Burhan;

import java.util.*;

public class Largest_Reactangle {
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 1, 5, 6};
        int ans = largestRectangle(arr);
        System.out.println(ans);
    }

    // Naive Solution
    static int LargestRect(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i-1; j >= 0; j--) {
                if (arr[i] <= arr[j]) {
                    curr += arr[i];
                }
                else{
                    break;
                }
            }

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    curr += arr[i];
                }
                else {
                    break;
                }
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    // Efficient O(n)
    static int largestRectangle(int[] arr) {
        int[] prev = prevSmaller(arr);
        int[] next = nextSmaller(arr);
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            curr += (i - prev[i] -1) * arr[i];
            curr += (next[i] - i -1) * arr[i];
            res = Math.max(res, curr);
        }
        return res;
    }





    // Extras
    static int[] nextSmaller(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();

        int[] ans = new int[arr.length];
        int length = ans.length-2;

        s.push(arr.length-1);
        ans[ans.length -1] = arr.length;


        for (int i = arr.length-2; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[length] = arr.length;
                length--;
            }
            else {
                ans[length] = s.peek();
                length--;
            }

            s.push(i);
        }
        return ans;
    }

    static int[] prevSmaller(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        int[] ans = new int[arr.length];
        int length = 1;

        s.push(0);
        ans[0] = -1;

        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[length] = -1;
                length++;
            }
            else {
                ans[length] = s.peek();
                length++;
            }
            
            s.push(i);
        }

        return ans; 
    }
}
