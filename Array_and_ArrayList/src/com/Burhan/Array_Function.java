package com.Burhan;

import java.util.Arrays;

public class Array_Function {
    public static void main(String[] args) {
        
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));

        change_obj(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void change_obj(int[] arr) {
        arr[0] = 99;
    }
}
