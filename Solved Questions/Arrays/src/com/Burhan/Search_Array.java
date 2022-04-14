package com.Burhan;

class Search_Array {
    public static void main(String[] args) {
        
        // Fixed and Unsorted Array
        int[] arr = {20, 5, 7, 34};

        // search(array, number you want to find)
        search(arr, 7);

    }

    // Search the position of a number in an array
    static void search(int[] arr, int num) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                System.out.println(i);;
            }
            else{
                System.out.println(-1);
            }
        }
    }
}