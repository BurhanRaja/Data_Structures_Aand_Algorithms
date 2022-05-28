package com.Burhan.Easy_Questions;

public class Reduce_to_Zero {
    public static void main(String[] args) {
        System.out.println(helper(8, 0));
    }
    
    private static int helper(int n, int count) {
        if (n==0) {
            return count;
        }

        if (n%2 == 0) {
            return helper(n/2, count+1);
        }
        return helper(n-1, count+1);
    }
}
