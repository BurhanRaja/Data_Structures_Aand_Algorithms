package com.Burhan;

public class Find_Min_RotatedSortedArrayTwo {
    public static void main(String[] args) {
        int[] arr = {1};
        // int[] arr = {2,2,2,0,1};
        int ans = findMin(arr);
        // int ans = pivotNum(arr);
        System.out.println(ans);
    }

    static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        
        while (start <= end) { 
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[end]) {
                start=mid+1;
            }
            else if (arr[start] < arr[mid]) {
                end = mid;
            }
            else {
                end--;
            }
        }
        return arr[start];   
    }
}
