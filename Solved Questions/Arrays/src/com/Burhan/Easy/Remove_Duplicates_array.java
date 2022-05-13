package com.Burhan.Easy;

public class Remove_Duplicates_array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30};

        rem_dup_array(arr);
        System.out.println(remove(arr));
    }

    static int[] rem_dup_array(int[] array) {
        int n = array.length;
        int[] temp = new int[n];
        temp[0] = array[0];
        int res = 1;

        for (int i = 0; i < n; i++) {
            if (temp[res-1] != array[i]) {
                temp[res] = array[i];
                res++;
            }
        }
        for (int j = 0; j < res; j++) {
            array[j] = temp[res];
        }
        return temp;
    }

    // Less space
    // {10, 20, 20, 30, 30, 30}
    static int remove(int[] nums){
        int n = nums.length;
        int res = 1; // 2, 3

        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[res-1]) {
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }
}
