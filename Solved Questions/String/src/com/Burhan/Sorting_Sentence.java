package com.Burhan;

public class Sorting_Sentence {
    public static void main(String[] args) {
        String a = "Myself2 Me1 I4 and3";
        
        sortedSentence(a);
    }

    static void sortedSentence(String sentence) {
        String[] temp = sentence.split(" ");
        String[] strArr = new String[temp.length];

        for (int i = 0; i < temp.length; i++) {
            char ch = temp[i].trim().charAt(temp[i].length()-1); 
            int index = ch - '0';

            temp[i] = removeChar(temp[i]);

            strArr[index-1] = temp[i];
        }

        System.out.println(String.join(" ", strArr));
    }

    static String removeChar(String a) {
        String ans = a.substring(0, a.length()-1) + a.substring((a.length()));
        return ans;
    }


}
