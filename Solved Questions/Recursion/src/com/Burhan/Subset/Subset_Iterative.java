package com.Burhan.Subset;

import java.util.ArrayList;
import java.util.List;

public class Subset_Iterative {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        List<List<Integer>> ans = subseqIter(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    static List<List<Integer>> subseqIter(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
