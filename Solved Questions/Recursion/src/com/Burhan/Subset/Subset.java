package com.Burhan.Subset;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        // subseq("", "abc");
        // System.out.println(subseqList("", "abc"));
        // subseqAscii("", "abc");
        System.out.println(subseqAsciiList("", "abc"));
    }

    static void subseq(String ans, String s) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        
        char ch = s.trim().charAt(0);

        subseq(ans + ch, s.substring(1));
        subseq(ans, s.substring(1));
    }

    // ArrayList method
    static ArrayList<String> subseqList(String ans, String s) {
        if (s.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        
        char ch = s.trim().charAt(0);
        
        ArrayList<String> allAnsWithCh = subseqList(ans + ch, s.substring(1));
        ArrayList<String> allAnsWithoutCh = subseqList(ans, s.substring(1));

        allAnsWithCh.addAll(allAnsWithoutCh);

        return allAnsWithCh;
    }
    
    // Ascii value
    static void subseqAscii(String ans, String s) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = s.trim().charAt(0);

        subseqAscii(ans+ch, s.substring(1));
        subseqAscii(ans, s.substring(1));
        subseqAscii(ans + (ch+0), s.substring(1));
    }

    static ArrayList<String> subseqAsciiList(String ans, String s) {
        if (s.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        
        char ch = s.trim().charAt(0);
        
        ArrayList<String> allAnsWithCh = subseqAsciiList(ans + ch, s.substring(1));
        ArrayList<String> allAnsWithoutCh = subseqAsciiList(ans, s.substring(1));
        ArrayList<String> allAnsWithAcsii = subseqAsciiList(ans + (ch+0), s.substring(1));

        allAnsWithCh.addAll(allAnsWithoutCh);
        allAnsWithCh.addAll(allAnsWithAcsii);

        return allAnsWithCh;
    }
}
