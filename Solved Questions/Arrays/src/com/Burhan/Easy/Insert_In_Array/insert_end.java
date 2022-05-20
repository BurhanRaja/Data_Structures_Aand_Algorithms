package com.Burhan.Easy.Insert_In_Array;

import java.util.Arrays;

public class insert_end {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = insertAtEnd(arr, 5, 90);
        System.out.println(Arrays.toString(ans));
    }

    static int[] insertAtEnd(int arr[],int sizeOfArray,int element)
    {
        int[] temp = new int[sizeOfArray+1];
        temp[0] = arr[0];
        //Your code here
        for (int i = 1; i < sizeOfArray; i++) {
            temp[i] = arr[i];
        }
        temp[sizeOfArray] = element;
        return temp;
    }
}
