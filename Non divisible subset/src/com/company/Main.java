package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        int arr[] = new int[k];
        for (int i = 0;i<n;i++)
        {
            arr[input.nextInt()%k]++;
        }
        int res = Math.min(arr[0],1);
        if(k%2==0)
        {
            arr[k/2] = Math.min(arr[k/2],1);
        }
        for(int i = 1;i<=k/2;i++)
        {
            res += Math.max(arr[i],arr[k-i]);
        }
        System.out.println(res);

    }
}
