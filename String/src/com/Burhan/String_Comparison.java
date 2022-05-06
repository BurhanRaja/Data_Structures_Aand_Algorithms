package com.Burhan;

public class String_Comparison {
    public static void main(String[] args) {
        
        // Check if 'a' varibale is equal to 'b' varibale

        String a = "Burhan";
        String b = "Burhan";

        System.out.println(a==b); // true
        
        // Here the values are same but different objects
        String s = new String("Burhan");
        String z = new String("Burhan");
        
        System.out.println(s==z); // false
        System.out.println(s.equals(z)); // true
    }
}
