package com.Burhan.Gfg;

import java.util.*;

public class First_Last_Position {
    public static void main(String[] args) {
        int[] array = {5, 7, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] answer = firstLastIndex(array, target);
        System.out.println(Arrays.toString(answer));
    }

    static int[] firstLastIndex(int[] arr, int target) {
        int[] ans = {-1,-1};

        ans[0] = firstOccurence(arr, target);
        ans[1] = lastOccurence(arr, target);

        return ans;
    }

    // First Index
    static int firstOccurence(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;

        while (s<=e) {
            int m = s+(e-s)/2;

            if (arr[m] > target) {
                e = m-1;
            }
            else if (arr[m] < target) {
                s = m+1;
            }
            else {
                if (m==0 || arr[m-1] != arr[m]) {
                    return m;
                }
                else {
                    e=m-1;
                }
            }
        }
        return -1;
    }

    // Last Index
    static int lastOccurence(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;

        while (s<=e) {
            int m = s+(e-s)/2;

            if (arr[m] > target) {
                e = m-1;
            }
            else if (arr[m] < target) {
                s = m+1;
            }
            else {
                if (m==arr.length-1 || arr[m+1] != arr[m]) {
                    return m;
                }
                else {
                    s=m+1;
                }
            }
        }
        return -1;
    }
}
