package com.Burhan.Array_Questions;

import java.util.Arrays;

public class Triangle_Array {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};

        triangleArr(A);
        System.out.println(Arrays.toString(A));
    }

    static void triangleArr(int[] A) {
        if (A.length < 1) {
            return;
        }
        int[] temp = new int[A.length-1];
        for (int i = 0; i < A.length - 1; i++)
        {
            int x = A[i] + A[i + 1];
            temp[i] = x;
        }
        
        triangleArr(temp);
        System.out.println(Arrays.toString(A));
    }
}
