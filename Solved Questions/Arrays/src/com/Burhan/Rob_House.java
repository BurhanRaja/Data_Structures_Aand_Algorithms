package com.Burhan;

public class Rob_House {
    public static void main(String[] args) {
        // int[] nums = {2, 1, 1, 2};
        int[] nums = {2, 7, 9, 3, 1};
        // int[] nums = {1, 2};
        int ans = robHouse(nums);
        System.out.println(ans);
    }

    static int robHouse(int[] nums) {
        int evensum = 0;
        int oddsum = 0;

        for (int i=0; i < nums.length; i++) {
            if (i%2==0) {
                evensum += nums[i];
                evensum = Math.max(evensum, oddsum); 
            }
            if (i%2!=0) {
                oddsum += nums[i];
                oddsum = Math.max(oddsum, evensum); 
            }
        }
        return Math.max(evensum, oddsum);
    }
}
