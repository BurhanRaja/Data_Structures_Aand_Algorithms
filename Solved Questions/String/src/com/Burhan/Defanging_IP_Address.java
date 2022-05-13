package com.Burhan;

public class Defanging_IP_Address {
    public static void main(String[] args) {
        String str = "1.1.1.1";
        defangingIP(str);
    }

    static void defangingIP(String str) {
        
        StringBuilder modified = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char character = str.trim().charAt(i);
            if (character == '.') {
                modified.append("[" + character + "]");
                continue;
            }
            modified.append(character);
        }
        modified.toString();
        System.out.println(modified);
    }
}
