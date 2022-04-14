package com.Burhan;

public class Second_largest {
    public static void main(String[] args) {
        int[] arr = {20, 5, 10, 9, 8};

        // System.out.println(largest(arr));

        largest(arr);
        
        System.out.println(second_large(arr));
    }

    // Here we are getting the index of the largest element in an array
    static int largest(int[] array){
        
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxValue]) {
                maxValue = i;   
            }
        }
        return maxValue;
    }

    static int second_large(int[] array) {

        // Here, secondmaxValue is initialized as -1 becoz in an array there can be all same value.
        int secondmaxValue = -1;
        int largest = largest(array);
        for (int i = 0; i < array.length; i++) {

            if (array[i] != array[largest]) {
                if (secondmaxValue == -1) {
                    secondmaxValue = i;
                }
                if (array[i] > array[secondmaxValue]) {
                    secondmaxValue = i;
                }
            }
        }
        return array[secondmaxValue];
    }
}
