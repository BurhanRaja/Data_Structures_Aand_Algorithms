package com.Burhan.Easy_Questions;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(30204, 0));
    }
    
    static int countZeros(int n, int count) {
        if (n==0) {
            return count;
        }

        if (n%10 == 0) {
            return countZeros(n/10, count+1);
        }

        return countZeros(n/10, count);
    }
}
