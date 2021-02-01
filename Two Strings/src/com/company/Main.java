package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int n = mk.nextInt();
        while (n-- > 0) {
            Set<Character> set1 = new HashSet<>();
            Set<Character> set2 = new HashSet<>();
            String s1 = mk.next(), s2 = mk.next();
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                set1.add(s1.charAt(i));
            }
            //System.out.println(list);
            for (int i = 0; i < s2.length(); i++) {
                set2.add(s2.charAt(i));
            }
            set1.retainAll(set2);
            if (set1.size() > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
