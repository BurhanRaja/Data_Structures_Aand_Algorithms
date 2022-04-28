package com.Burhan;

public class Bad_Version {
    public static void main(String[] args) {
        int ans = firstBadVersion(5);
        System.out.println(ans);
    }

    static int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        
        while (start <= end) {
            int mid = start + (end-start)/2;
            boolean badV = isBadVersion(mid);
            
            if (badV == false) {
                start = mid+1;
            }
            else if (badV == true) {
                end = mid-1;
            }
        }
        return start;
    }

    static boolean isBadVersion(int num) {
        int bad = 4;

        if (num == bad) {
            return true;
        }
        else {
            return false;
        }
    }
}
