package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static long getWays(int n, List<Long> coin) {
        long t[][] = new long[coin.size()+1][n+1];
        t[0][0] = 1;
        for(int i = 1;i<=coin.size();i++)
        {
            for(int j = 0;j<=n;j++)
            {
                if(coin.get(i-1)>j)
                {
                    t[i][j] = t[i-1][j];
                }else
                {
                    t[i][j] = t[i-1][j]+t[i][(int) (j-coin.get(i-1))];
                }
            }
        }

        return t[coin.size()][n];

    }

    public static void main(String[] args) {
	    Scanner mk = new Scanner(System.in);
	    int n = mk.nextInt();
	    int m = mk.nextInt();
	    List<Long> list = new ArrayList<>();
	    for(int i = 0;i<m;i++)
        {
            list.get(mk.nextInt());
        }
	    long result = getWays(n,list);
        System.out.println(result);
    }
}
