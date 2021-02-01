package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner mk = new Scanner(System.in);
        int t = mk.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<t;i++)
        {
            map.put(i+1,mk.nextInt()+mk.nextInt());
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e-> {
            System.out.print(e.getKey()+" ");
        });
    }
}
