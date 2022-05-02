package com.Burhan;

public class Perfect_Square {
    public static void main(String[] args) {
        int num = 2000143832;
        System.out.println(isPerfectSquare(num));
    }

    // Here num is divided by mid to reduce the search space
    static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;
        if (num==1) {
            return true;
        }
        while (start <= end) {
            long mid = start + (end-start)/2;
            if (mid*mid == num) {
                return true;
            }
            else if (mid*mid < num) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;
    }
}
