package com.Burhan;

public class Outputs {
    public static void main(String[] args) {
        // System.out.println();
        // out is a variable of class PrintStream
        // println is a function inside the class PrintStream

        System.out.println(56);
        // Here the println(int) is used to print an integer
        // This integer is converted to string in order to print it on terminal

        System.out.println("Burhan");
        // Here, the println(String) is used to print String
        // This println checks whether the obj is null or not and then it will print

        System.out.println(new int[]{2, 3, 4, 5});
        // Here, the println(Object) is used for printing this
        // The array is not printed instead it will print a letter-@-hashcode in sequence
        // Becoz java does not know how to print this so we call Arrays.toString() to print this in pretty form
    }
}
