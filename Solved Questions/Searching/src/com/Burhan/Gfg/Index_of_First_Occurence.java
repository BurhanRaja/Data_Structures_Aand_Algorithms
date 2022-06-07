package com.Burhan.Gfg;

public class Index_of_First_Occurence {
    public static void main(String[] args) {
        int[] arr = {10,10,10};
        // int ans = binarySearch(arr, 30);
        int ans = RBinarySearch(arr, 10, 0, arr.length-1);
        System.out.println(ans);
    }

    // Iterative Binary Search for first occurence
    static int binarySearch(int[] arr, int target) {
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

    // Recursive Binary Search for first occurence
    static int RBinarySearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s+(e-s)/2;

        if (arr[m] > target) {
            return RBinarySearch(arr, target, s, m-1);
        }
        else if (arr[m] < target) {
            return RBinarySearch(arr, target, m+1, e);
        }
        else {
            if (m==0 || arr[m-1] != arr[m]) {
                return m;
            }
            else {
                return RBinarySearch(arr, target, s, m-1);
            }
        }
    }
}
