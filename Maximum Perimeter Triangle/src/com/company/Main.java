package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner mk = new Scanner(System.in);
        int n = mk.nextInt();
        Integer arr[] = new Integer[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = mk.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0;i<n-2;i++)
        {
            if(arr[i]<arr[i+1]+arr[i+2])
            {
                System.out.println(arr[i+2]+" "+arr[i+1]+" "+arr[i]);
                return;
            }
        }
        System.out.println("-1");
    }
}
