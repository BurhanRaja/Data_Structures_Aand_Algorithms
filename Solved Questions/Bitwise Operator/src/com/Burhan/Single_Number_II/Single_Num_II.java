package com.Burhan.Single_Number_II;

public class Single_Num_II {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 2, 7, 3, 8, 3, 7, 7, 8, 8, 19};
        // int[] arr = { 3, 3, 2, 3, 3, 7, 7, 8, 7, 7, 8, 8, 8};
        int fAnswer = 0;
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                int numLast = arr[j] & 1;
                sum += numLast;
                arr[j] = arr[j] >> 1;
            }
            int ans = sum % 3;
            int power = (int) Math.pow(10, i);
            fAnswer = fAnswer + ans * power;
            System.out.println(fAnswer);
        }

        System.out.println(convertBinaryToDecimal(fAnswer));
    }

    static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }

        return decimalNumber;
    }
}