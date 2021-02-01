package com.company;

import java.util.Scanner;

public class Main {

    static void extraLongFactorials(int n) {
        int arr[] = new int[5000];
        int len = 1, s = 2, f = 0, num = 0;
        arr[0] = 1;
        while (s <= n) {
            f = 0;
            num = 0;
            while (f < len) {
                arr[f] *= s;
                arr[f] += num;
                num = arr[f] / 10;
                arr[f] = arr[f] % 10;
                f++;
            }
            while (num != 0) {
                arr[len] = num % 10;
                num = num / 10;
                len++;
            }
            s++;
        }
        len--;
        for (int i = len; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }


        public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int m = mk.nextInt();
        extraLongFactorials(m);
    }
}
