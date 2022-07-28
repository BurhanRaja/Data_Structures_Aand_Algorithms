package com.Burhan;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int[] arr = {5, 15, 10, 8, 6, 12, 9, 18};
        int[] ans  = nextGreater(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] nextGreater(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        
        int[] ans = new int[arr.length];
        int length = ans.length-2;

        s.push(arr.length-1);
        ans[ans.length -1] = -1;


        for (int i = arr.length-2; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[length] = -1;
                length--;
            }
            else {
                ans[length] = arr[s.peek()];
                length--;
            }

            s.push(i);
        }
        return ans;
    }
}
