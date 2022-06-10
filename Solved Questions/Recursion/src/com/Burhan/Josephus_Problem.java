package com.Burhan;

import java.util.ArrayList;

public class Josephus_Problem {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 7;
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int k = 3;

        int ans = josephusProb(list, k, 0);
        System.out.println(ans);
    }

    static int josephusProb(ArrayList<Integer> members, int k, int count) {
        if (members.size() == 2) {
            return members.get(1);
        }
        if (count >= members.size()-1 && members.size() > 2) {
            count = 0;
        }
        
        count = count+k-1;
        members.remove(count);

        return josephusProb(members, k, count);
    }
}