package com.Burhan;

public class Sqaure_Root {
    public static void main(String[] args) {
        int ans = squareRoot(13);
        System.out.println(ans);
    }

    static int squareRoot(int x) {
        
        if (x < 2) {
            return x;
        }

        int left = 2;
        int right = x/2;

        while (left <= right) {
            int mid = left + (right-left)/2;
            long square = mid*mid;
            if (x > square) {
                left = mid+1;
            }
            else if (x < square) {
                right = mid-1;
            }
            else {
                return mid;
            }
        }
        return right;
        
    }
}
