package com.Burhan;

class Peak_Element {
    public static void main(String[] args) {
        int[] arr = {13};
        int ans = peakNum(arr);
        System.out.println(ans);
    }

    // {1, 2, 5, 1}
    static int peakNum(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        if (arr.length<2) {
            return arr.length-1;
        }

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (mid<end && arr[mid+1] > arr[mid]) {
                start = mid+1;
            }
            else if (mid>start && arr[mid-1] > arr[mid]) {
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}