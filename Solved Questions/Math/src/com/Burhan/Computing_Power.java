package com.Burhan;

public class Computing_Power {
    public static void main(String[] args) {
        int ans = powerNum(3, 5);
        System.out.println(ans);
    }

    static int powerNum(int x, int n) {
        if (n==0) {
            return 1;
        }

        int temp = powerNum(x, n/2) * powerNum(x, n/2);
        
        if (n%2==0) {
            return temp;
        }
        else {
            return temp*x;
        }
    }
}
