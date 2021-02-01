package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int t = input.nextInt();
        while (t-->0)
        {
            int n = input.nextInt(), k = input.nextInt();
            if(k==0)
            {
                for (int i = 1;i<=n;i++)
                {
                    System.out.print(i+" ");

                }
                System.out.println();

            }
            else if(n%k==0 && n%(2*k)==0)
            {
                int p = n/k;
                int crrent = k;
                for(int i = 0;i<p;i++)
                {
                    for(int j = 0;j<k;j++)
                    {
                        crrent++;
                        System.out.print(crrent+" ");
                    }
                    if(i%2==1)
                    {
                        crrent+=2*k;
                    }else
                    {
                        crrent-=2*k;
                    }

                }
                System.out.println();
            }
            else {
                System.out.println(-1);
            }
            // System.out.println(list);
        }


    }
}
