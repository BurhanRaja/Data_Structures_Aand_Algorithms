package com.Burhan;

public class Sentence_Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        // System.out.println(sentence.length());
        boolean ans = pangram(sentence);
        System.out.println(ans);
    }

    static boolean pangram(String sentence) {
        boolean present = true;

        for (char i = 'a'; i <= 'z'; i++) {
            if(!sentence.contains(String.valueOf(i))) {
                present = false;
            }
        }
        if(present == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
