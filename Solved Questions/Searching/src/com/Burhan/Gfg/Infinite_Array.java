package com.Burhan.Gfg;

public class Infinite_Array {
    public static void main(String[] args) {
        // Consider it as millions of Number
        int[] arr = {20,30,40,50,80,100,200,240,300,350,390,400,410,420,470,500, 800};
        int ans = findNumInfinite(arr, 350);
        System.out.println(ans);
    }

    static int findNumInfinite(int[] arr, int x) {
        if (arr[0] == x) {
            return 0;
        }
        int i = 1;
        while (arr[i] < x) {
            i*=2;
        }

        if (arr[i] == x) {
            return i;
        }

        return binarySearch(arr, x, (i/2)+1, i-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (arr[mid] < target) {
                start = mid+1;
            }
            else if (arr[mid] > target) {
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
