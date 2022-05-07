package com.Burhan;

public class S_B {
    public static void main(String[] args) {
        // The Naive Method for printing all the letters 
        // This stores the value at every i iterates. So, the memory usage increase which is not an optimize way of print program
        // String word = "";

        // for (int i = 0; i < 26; i++) {
        //     char ch = (char)('a'+i);
        //     word = word+ch;
        // }
        // System.out.println(word);

        // Efficient Method
        // This will keep appending the char as an Array does.
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
