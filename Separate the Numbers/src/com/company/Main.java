package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        String s = mk.next();
        Separate_the_Numbers(s);
    }

    private static void Separate_the_Numbers(String s) {
        String subsequence = "";
        int c = 0;
        for (int i = 1; i <=s.length()/2; i++) {
            subsequence = s.substring(0, i);
            long num = Long.parseLong(subsequence);
            String valid = subsequence;
            while (valid.length() < s.length()) {
                valid += Long.toString(++num);
            }
            if (s.equals(valid)) {
                c = 1;
                break;
            }
        }
        if (c == 1) {
            System.out.println("YES " + subsequence);
        } else {
            System.out.println("NO");
        }
    }
}
