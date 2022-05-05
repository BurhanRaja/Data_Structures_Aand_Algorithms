package com.Burhan;

public class String_immutable {
    public static void main(String[] args) {

        // Here, the objects are not changing but one is created for the name variable

        String  name = "Burhan";
        System.out.println(name);
        String b = "Burhan";
        name = "Raja";
        System.out.println(name + " " + b);

    }

}
