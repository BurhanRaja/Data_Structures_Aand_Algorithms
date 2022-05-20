package com.Burhan.Single_Number;

public class Single_Num {
    public static void main(String[] args) {
        int[] nums = {2,2,1,3,3};
        int ans = singleNum(nums);
        System.out.println(ans);
    }

    static int singleNum(int[] nums) {
                
        int res = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        
        return res;
    }
}
