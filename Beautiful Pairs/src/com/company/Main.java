package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner mk = new Scanner(System.in);
        int n = mk.nextInt();
        int contain = 0, chanage = 0,l = 0;
        List<Integer>list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            list.add(mk.nextInt());
        }

        for(int i = 0;i<n;i++)
        {
            list1.add(mk.nextInt());
        }

        for (int i = 0; i < n; i++) {
            if (list1.contains(list.get(i))) {
                int v = list1.indexOf(list.get(i));
                list1.remove(v);
                list1.add(v,-1);
                contain++;
            }
        }
        if(contain==list.size()) {
            System.out.println(contain-1);
        }else {
            System.out.println(contain+1);

        }
    }
}
