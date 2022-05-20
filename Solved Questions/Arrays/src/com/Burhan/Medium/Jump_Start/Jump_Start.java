package com.Burhan.Medium.Jump_Start;

public class Jump_Start {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        // int[] arr = {3,2,1,0,4};
        // int[] arr = {3,3,1,0,2,3,2,8};
        // int[] arr = {0, 1};
        // boolean ans = jumpStart(arr);
        boolean ans = jump(arr);
        System.out.println(ans);
    }

    // Same But from front and Taking time in LeetCode
    static boolean jumpStart(int[] arr) {
        int i = 0;
        while (i  <arr.length) {  
            i+=arr[i];        
            if (i == arr.length) {
                return true;
            }
        }
        return false;
    }

    // Coming from the backside of the array to check whether it reaches 0 or not;
    static boolean jump(int[] nums) {
        int goodIndex = nums.length - 1;
        
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] + i >= goodIndex){
                goodIndex = i;
            }
        }
        
        return goodIndex == 0;
    }
}
