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
            int n_3 = 0,n_5 = 0,flag = 0;
            n_5 = n;
            while (n_3<=n && n_5>=0)
            {
//
//               System.out.print("n_3 : "+n_3+" ");
//               System.out.print("n_5 : "+n_5);
                if(n_3%5==0 && n_5%3==0)
                {
                    flag = 1;
                    for (int i = 0;i<n_5;i++)
                    {
                        System.out.print("5");
                    }

                    for (int i = 0;i<n_3;i++)
                    {
                        System.out.print("3");
                    }
                    System.out.println();
                    break;
                }
//               System.out.println();
                n_3+=5;
                n_5 = n-n_3;
            }
            if(flag==0)
            {
                System.out.println("-1");
            }
        }
    }
}
