package com.Burhan.Count_binary_Num;

public class Count_Binary {
    public static void main(String[] args) {
        int n = 19;
        int b = 2;

        int ans = (int) (Math.log(n) / Math.log(b)) + 1;

        System.out.println(ans);
    }
}
