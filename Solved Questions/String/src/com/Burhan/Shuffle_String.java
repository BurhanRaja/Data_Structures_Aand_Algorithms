package com.Burhan;

public class Shuffle_String {
    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        String str = "codeleet";
        shuffle(str, indices);
    }

    static void shuffle(String str, int[] indices) {
        
        // StringBuilder unshuffled = new StringBuilder();
        char[] unshuffled = new char[str.length()];

        for (int i = 0; i < indices.length; i++) {
            char c = str.trim().charAt(i);
            unshuffled[indices[i]] = c;
        }
        System.out.println(new String (unshuffled));
    }
}
