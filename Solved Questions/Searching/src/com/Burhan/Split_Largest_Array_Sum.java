package com.Burhan;

public class Split_Largest_Array_Sum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 8, 10};
        int ans = splitSum(arr, 2);
        System.out.println(ans);
    }

    static int splitSum(int[] arr, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while (start < end) {
            int mid = start + (end-start)/2;
            int sum = 0;
            int piece = 1;

            for (int i=0; i<arr.length; i++){
                if (sum + arr[i] > mid) {
                    sum = arr[i];
                    piece++;
                }
                else {
                    sum += arr[i];
                }
            }

            if (piece > m) {
                start = mid+1;
            }
            else {
                end = mid;
            }

        }

        return end;
    } 
}
