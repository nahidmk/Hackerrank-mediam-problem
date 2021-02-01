package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner mk = new Scanner(System.in);
        int test = mk.nextInt();
        while (test-->0) {
            int n = mk.nextInt();
            int m = mk.nextInt();
            String s = Chessboard(n, m);
            System.out.println(s);
        }

    }

    private static String Chessboard(int x, int y) {
        x = x%4;
        y = y%4;
        if((y==0)||(y==3)||(x==0)||(x==3)) return "First";
        return "Second";
    }
}
