package com.Burhan;

public class Single_Element_in_Sorted {
    public static void main(String[] args) {
        // int[] arr = {1,1,2,3,3,4,4,8,8};
        int[] arr = {3,3,7,7,10,11,11};
        int ans = findNum(arr);
        System.out.println(ans);
    }

    static int findNum(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int i = 0;
        while (i<arr.length) {
            if (i>=0 && i<arr.length-1 && arr[i] != arr[i+1]) {
                return arr[i];
            }
            else if (i == arr.length-1) {
                return arr[i];
            }
            else {
                i++;
            }
        }
        return -1;
    }
}
