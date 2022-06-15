package com.Burhan.Gfg;

public class Repeating_Elements {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,2,3};
        int ans = repeatElem(arr);
        System.out.println(ans);
    }

    // Efficient solution
    static int repeatElem(int[] arr) {
        boolean[] visited = new boolean[arr.length-1];

        for (int i = 0; i < arr.length; i++) {
            if (visited[arr[i]]) {
                return arr[i];
            }
            visited[arr[i]] = true;
        }

        return -1;
    }

    // Remaining the O(1) Auxilary space, O(n) time complexity and not modifying the array
}
