package com.Burhan.Easy;

public class Find_Even_digit_num {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(evenDigit(arr));
    }

    static int evenDigit(int[] nums) {
        int n = nums.length;
        int evenDigit = 0;
        for (int i = 0; i<n; i++) {
            int count = 0;
            while (nums[i] > 0) {
                nums[i] /= 10;
                count++;
            }
            if (count % 2 == 0) {
                evenDigit++;
            }
        }
        return evenDigit;
    }
}
