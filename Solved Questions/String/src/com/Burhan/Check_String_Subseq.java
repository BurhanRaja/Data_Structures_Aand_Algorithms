package com.Burhan;

public class Check_String_Subseq {
    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ADE";

        System.out.println(StringSubseq(s1, s2));
    }

    static boolean StringSubseq(String s1, String s2) {
        int i=0;
        int j=0;
        boolean flag = false;
        while (i<s1.length() && j<s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                flag=true;
                i++;
                j++;
            }
            else {
                flag=false;
                i++;
            }
        }

        return flag;
    }
}
