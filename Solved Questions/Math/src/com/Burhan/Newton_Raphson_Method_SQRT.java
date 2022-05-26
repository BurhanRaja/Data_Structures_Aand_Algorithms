package com.Burhan;

public class Newton_Raphson_Method_SQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n) {
        double x = n;
        double root;
        while(true) {
            root = 0.5 * (x+(n/x));
            
            // For precetion
            if (Math.abs(root-x) < 0.2) {
                break;
            }
            x = root;
        }
        return root;
    }
}