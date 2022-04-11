package com.Burhan;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[5];

        // ** Manually typing the elements in array **
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        // System.out.println(arr[3]);


        // ** Now taking input of arrays using for loop **
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = inp.nextInt();
        // }


        // ** To print every element of the array **
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // ** Can also do this to print every elements in an array **
        // for (int i : arr) {
        //     System.out.print(arr[i]);
        // }

        // ** Easiest way to print the array **
        // System.out.println(Arrays.toString(arr));
        // This will convert an array into a string and print all the elements from the memory


        // ** Not Possible **
        // System.out.print(arr[5]);
        // Error Given:- java.lang.ArrayIndexOutOfBoundsException
        
        // ** Array of Objects **
        
        String[] str = new String[4];
        
        for (int i = 0; i < str.length; i++) {
            str[i] = inp.next();     
        }

        System.out.print(Arrays.toString(str));

        // Change on an array
        str[2] = "AnyName";
        System.out.print(Arrays.toString(str));

        inp.close();
    }
}
