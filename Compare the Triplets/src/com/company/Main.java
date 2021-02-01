package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner mk = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2  = new ArrayList<>();
        int n = mk.nextInt();
        for(int i = 0;i<n;i++)
        {
            list1.add(mk.nextInt());
        }
        for(int i = 0;i<n;i++)
        {
            list1.add(mk.nextInt());
        }
        List<Integer> list = compareTriplets(list1,list2);
        list.forEach(System.out::println);
    }

    private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> list = new ArrayList<>();
        int al = 0;
        int bo = 0;
        for(int i = 0;i<a.size();i++)
        {
            if(a.get(i)<b.get(i))
            {
                bo++;
            }else if(a.get(i)>b.get(i))
            {
                al++;
            }
        }
        list.add(al);
        list.add(bo);

        return list;
    }
}
