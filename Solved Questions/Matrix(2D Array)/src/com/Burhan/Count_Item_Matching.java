package com.Burhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count_Item_Matching {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        Scanner inp = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            items.add(new ArrayList<>());
        }

        // Inputing number
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                items.get(i).add(inp.next());
            }
        }


        String rulekey = "color";
        String ruleValue = "silver";
        int ans = matchItem(items, rulekey, ruleValue);
        System.out.println(ans);

        inp.close();
    }
    // [["phone","blue","pixel"],
    // ["computer","silver","lenovo"],
    // ["phone","gold","iphone"]]

    static int matchItem(List<List<String>> items, String rulekey, String ruleValue) {
        int row;
        int ans=0;

        if (rulekey == "type") {
            for (row = 0; row < items.size(); row++) {
                if (items.get(row).get(0) == ruleValue) {
                    ans++;
                }
            }  
        }

        else if (rulekey == "color") {
            for (row = 0; row < items.size(); row++) {
                if (items.get(row).get(1) == ruleValue) {
                    ans++;
                }
            }
        }

        else if (rulekey == "name") {
            for (row = 0; row < items.size(); row++) {
                if (items.get(row).get(2) == ruleValue) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
