package com.Burhan.Gfg;

public class Count_Occurences {
    public static void main(String[] args) {
        int[] arr = {10, 20,20, 30,30,30, 40,40,40,40};
        int target = 40;

        int ans = count(arr, target);
        System.out.println(ans);
    }

    // Time Complexity O(logn) where,
    static int count(int[] arr, int target) {
        int count = 0;
        int firstIndex = firstOccurence(arr, target);
        int lastIndex = lastOccurence(arr, target);
        if (firstIndex == -1 && lastIndex == -1) {
            return count;
        }
        else {
            count = lastIndex - firstIndex;
        }

        return count+1;
    }

    static int firstOccurence(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;

        while (s<=e) {
            int m = s+(e-s)/2;

            if (target < arr[m]) {
                e = m-1;
            }
            else if (target > arr[m]) {
                s=m+1;
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
