package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = mk.nextInt();
        for(int i = 0;i<n;i++){
            list.add(mk.nextInt());
        }

        int number = Picking_Numbers(list);
        System.out.println(number);
    }

    private static int Picking_Numbers(List<Integer> a) {
        int v = Collections.max(a);
        int arr[] = new int[v+1];
        for(int i = 0;i<a.size();i++)
        {
            arr[a.get(i)]++;
        }
        int max = 0;
        for(int i = 0;i<v;i++)
        {
            if(arr[i]+arr[i+1]>max)
            {
                max = arr[i]+arr[i+1];
            }
        }
        return max;

    }
}
