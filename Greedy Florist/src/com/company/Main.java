package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int n = mk.nextInt();
        int k = mk.nextInt();
        Integer arr[]= new Integer[n];
        int frid[] = new int[k+1];
        int count = 0, sum = 0;
        for(int i = 0;i<n;i++)
        {
            arr[i] = mk.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0;i<n;i++)
        {
            if(count<k)
            {
                count++;
                sum += arr[i] *(frid[count]+1);
                frid[count]++;
            }else
            {
                count = 1;
                sum += arr[i] *(frid[count]+1);
                frid[count]++;
            }
        }
        System.out.println(sum);


    }
}
