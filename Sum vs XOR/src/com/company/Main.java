package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner mk = new Scanner(System.in);

        long n = mk.nextLong();

        long result = Sum_vs_XOR(n);
        System.out.println(result);
    }

    private static long Sum_vs_XOR(long n) {

        long z = 0;
        while(n>0)
        {
            if(n%2==0)
            {
                z++;
            }
            n/=2;
        }
        return (long)Math.pow(2,z);
    }
}
