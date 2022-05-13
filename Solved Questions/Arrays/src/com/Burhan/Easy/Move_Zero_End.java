package com.Burhan.Easy;

import java.util.Arrays;

public class Move_Zero_End {
    public static void main(String[] args) {
        int[] arr = {8, 5, 0, 10, 0, 20};
        // Zero_End(arr);
        eff_zero_end(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Naive Method (n^2 time)
    // {{{{ 
    static void Zero_End(int[] array) {
        
        int n = array.length;
        int i;

        for (i = 0; i < n; i++) {
            if (array[i] == 0) {
                for (int j = i+1; j < n; j++) {
                    if (array[j] != 0) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }   
        }
    }
    // }}}}

    // Efficient Way (Linear time)
    static void eff_zero_end(int[] array) {
        int n = array.length;
        int count = 0;

        // {8, 5, 0, 10, 0, 20}
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                int temp = array[count];
                array[count] = array[i];
                array[i] = temp;
                count++;
            }
        }
    }
}
