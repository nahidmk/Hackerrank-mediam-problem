package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner mk = new Scanner(System.in);
        int t = mk.nextInt();
        while (t-->0)
        {
            int n = mk.nextInt();
            if(n%7==0 || n%7==1)
            {
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }

}
