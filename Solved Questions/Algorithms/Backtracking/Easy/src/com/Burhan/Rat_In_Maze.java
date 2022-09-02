package com.Burhan;


public class Rat_In_Maze {
    public static void main(String[] args) {
        solveMaze();
    }

    static int maze[][] = {
        {1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 0, 1, 0},
        {0, 1, 1, 1}
    };
    static int n = maze.length;
    static int sol[][] = new int[n][n];

    // For Backtracking Solution
    static boolean isSafe(int i, int j) {
        return (i<n && j<n && maze[i][j]==1);
    }

    static boolean solveMaze() {
        if (solveMazeRec(0, 0) == false) {
            System.out.print("No");
            return false;
        }
        else {
            System.out.print("Yes");
            return true;
        }
    }

    static boolean solveMazeRec(int i, int j) {
        if (i == n-1 && j == n-1) {
            sol[i][j] = 1;
            return true;
        }

        if (isSafe(i, j)) {
            sol[i][j] = 1;
            if (solveMazeRec(i+1, j) == true){
                return true;
            }
            else if (solveMazeRec(i, j+1) == true){
                return true;
            }
        }
        return false;
    }

}