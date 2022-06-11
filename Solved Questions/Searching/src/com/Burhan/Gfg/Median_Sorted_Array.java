package com.Burhan.Gfg;

public class Median_Sorted_Array {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        // int[] arr1= {10,20,30,40,50};
        // int[] arr2 = {5,15,25,35,45};
        // float[] arr1 = {1,3,5,15,17};
        // float[] arr2 = {2,8,10,12,20};
        double ans = MedianArray(arr1, arr2);
        System.out.print(ans);
    }

    static double MedianArray(int[] arr1, int[] arr2) {
        float[] mix = mergeArray(arr1, arr2);
        if ((mix.length-1)%2==0) {
            int mid = (0+mix.length-1)/2;
            return (double) mix[mid];
        }
        else {
            int mid = (0+mix.length-1)/2;
            return (double) (mix[mid]+mix[mid+1])/2;
        }
    }

    static float[] mergeArray(int[] arr1, int[] arr2) {
        float[] newarray = new float[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newarray[k] = arr1[i];
                i++;
            }
            else {
                newarray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            newarray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            newarray[k] = arr2[j];
            j++;
            k++;
        }

        return newarray;
    }
}
