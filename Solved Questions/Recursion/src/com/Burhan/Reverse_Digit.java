package com.Burhan;

public class Reverse_Digit {
    public static void main(String[] args) {
        int n = 1234;
        reverseDigit(n);

        // only when second way is used
        // {{
        //      if (sum%10 == 0) {
        //          sum/=10;
        //      }
        //                  }}
        
        System.out.println(sum);
    }

    // 1st Way
    static int sum = 0;
    static void reverseDigit(int n) {   
        if (n > 0) {
            sum = 10*sum + n%10;
            reverseDigit(n/=10);
        }
        else {
            return;
        }
    }

    // 2nd Way
    // static int sum = 0;
    // static void reverseDigit(int n) {   
    //     if (n==0) {
    //         return;
    //     }
    //     int temp = n;
    //     int count = 0;
    //     while (temp != 0) {
    //         temp/=10;
    //         count++;
    //     }
    //     sum = sum + (int) Math.pow(10, count) * (n%10);
    //     reverseDigit(n/=10);
    // }
}
