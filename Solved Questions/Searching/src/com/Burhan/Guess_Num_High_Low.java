package com.Burhan;

public class Guess_Num_High_Low {
    public static void main(String[] args) {
        
    }

    static int guessNum(int n) {
        int start = 0;
        int end = n;
        
        while (start <= end) {
            int mid = start + (end-start)/2;
            
            if (guess(mid) == 1) {
                start = mid+1;
            }
            else if (guess(mid) == -1) {
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return end;
    }

    static int guess(int num) {
        int picked = 4;
        if (num > picked) {
            return -1;
        }
        else if (num < picked) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
