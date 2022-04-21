package com.Burhan;

class Ceiling_Number {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int ans = ceilNum(arr, 15);
        System.out.println(ans);
    }

    static int ceilNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        
        while (start <= end) { // when condition hit start <= end and start = end + 1 we return it;
            int mid = start + (end - start)/2;

            if (arr[mid] > target) {
                end = mid-1;
            }
            else if (arr[mid] < target) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}