package com.Burhan;

import java.util.ArrayList;

public class Max_Candies {
    public static void main(String[] args) {
        // int[] kidsCandies = {4,2,1,1,2};
        // int[] kidsCandies = {12,1,12};
        // int[] kidsCandies = {2,3,5,1,3};
        // int[] kidsCandies = {2, 8, 7};
        int[] kidsCandies = {7,2,5,6,9,9,4,5};
        System.out.println(kidsWithCandies(kidsCandies, 3));
    }
    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean> list = new ArrayList<>(n);
        int maximum = candies[0];

        for (int i = 0; i < n; i++) {
            if (candies[i] > maximum) {
                maximum = candies[i];
            }
        }

        for (int i = 0; i < n; i++){
            int sumi = candies[i] + extraCandies;
            if (sumi < maximum) {
                list.add(false);
            }
            else {
                list.add(true);
            }          
        }

        return list;
    }
}
