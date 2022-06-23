package com.Burhan;

import java.util.*;

public class Union_Two_Array {
    public static void main(String[] args) {
        int[] a = {10,30,10};
        int[] b = {5,10,5};

        // int ans = unionArr(a, b);
        int ans = unionArrays(a, b);
        System.out.println(ans);
    }

    static int unionArr(int[] a, int[] b) {
        ArrayList<Integer> distinct = new ArrayList<>();
        int res= 0;
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                res++;
                distinct.add(a[i]);
            }
        }

        for (int i = 0; i < b.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (b[i] == b[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag && !distinct.contains(b[i])) {
                res++;
                distinct.add(b[i]);
            }
        }

        System.out.println(distinct);
        return res;
    }

    // Efficient Soln
    static int unionArrays(int[] a, int[] b) {
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            h.add(a[i]);
        }
        
        for (int i = 0; i < b.length; i++) {
            h.add(b[i]);
        }

        return h.size();
    }
}
