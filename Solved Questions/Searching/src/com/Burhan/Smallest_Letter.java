package com.Burhan;

public class Smallest_Letter {
    public static void main(String[] args) {
        char[] array = {'c', 'f', 'j'};
        char target = 'a';
        char ans = smallestLetter(array, target);
        System.out.println(ans);
    }

    static char smallestLetter(char[] letters, char target) {
        int n = letters.length;
        int start = 0;
        int end = letters.length;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (target < letters[mid]) {
                end = mid-1;
            }
            else if (target > letters[mid]){
                start = mid+1;
            }
        }
        return letters[start%n];
    }
}
