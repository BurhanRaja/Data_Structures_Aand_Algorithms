package com.Burhan;

public class Maximum_Consecutive_One {
    public static void main(String[] args) {
        // int[] array = {0,1,1,1,1,0,1,0};
        int[] array = {0,1,1,1,0,1,1};
        int ans = maxOne(array);
        System.out.println(ans);
    }

    static int maxOne(int[] arr) {
        int n = arr.length;
        int count = 0;
        int res = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count = 0;
            }
            else {
                count++;
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
