package com.Burhan;

import java.util.Arrays;

public class First_Last_Position {
    public static void main(String[] args) {
        int[] array = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 8;
        int[] answer = finalFandL(array, target);
        System.out.println(Arrays.toString(answer));
    }

    static int[] finalFandL(int[] arr, int target) {
        int[] ans = {-1, -1};
        
        int start = fandl(arr, target, true); 
        int end = fandl(arr, target, false); 

        ans[0] = start;
        ans[1] = end;

        return ans;

    }

    static int fandl(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                ans = mid;
                // find start index i.e. the end will come close to start so that's why end=mid-1
                if (findStartIndex) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }

        return ans;
    }
}
