package com.Burhan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Count_Small_Num {
    public static void main(String[] args) {
        // int[] nums = {5,2,6,1};
        // int[] nums = {1, 1};
        int[] nums = {26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41};
        // int[] nums = {8,1,2,2,3};

        List<Integer> answer = countNum(nums);
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
    // {1,2,5,6}
    // [4,0,1,1,3]
    static List<Integer> countNum(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }
        Collections.sort(arr);

        for (int i = 0; i < nums.length; i++) {
            int ans = binarySearch(arr, nums[i]);
            list.add(ans);
            arr.remove(ans);
        }

        return list;
    }

    static int binarySearch(List<Integer> arr, int target) {
        int s = 0;
        int e = arr.size()-1;

        while (s <= e) {
            int m = s+(e-s)/2;
            int val = arr.get(m);
            if (val < target) {
                s=m+1;
            }
            else if (val > target) {
                e=m-1;
            }
            else {
                return m;
            }
        }
        return -1;
    }
}
