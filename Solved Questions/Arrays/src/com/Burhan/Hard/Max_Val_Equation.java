package com.Burhan.Hard;

public class Max_Val_Equation {
    public static void main(String[] args) {
        // 1.
        // int[][] points = {
            //     {1,3},
            //     {2,0},
            //     {5,10},
            //     {6,-10}
            // };

            // 2.
        int[][] points = {
                {0,0},{3,0},{9,2}
            };
        // int[][] points = {
        //         {-19,9},{-15,-19},{-5,-8}
        //     };
        // int[][] points = {
        //         {0,0},{1,-1}
        //     };
        int k = 3; // 3 // 1


        
// [[-19,-12],[-13,-18],[-12,18],[-11,-8],[-8,2],[-7,12],[-5,16],[-3,9],[1,-7],[5,-4],[6,-20],[10,4],[16,4],[19,-9],[20,19]]
// 6
        int ans = maxVal(points, k);
        System.out.println(ans);

        System.out.println(Math.max(-2491291, 0));
    }

    static int maxVal(int[][] points, int k) {
        int sum = Integer.MIN_VALUE;

        if (points.length==1) {
            return -1;
        }

        for (int row = 0; row <= points.length-2; row++) {
            int x = Math.abs(points[row][0] - points[row+1][0]);
            if (x <= k) {
                int y = points[row][1] + points[row+1][1];
                sum = Math.max(sum, x+y);
            }
        }

        return sum;
    }
}