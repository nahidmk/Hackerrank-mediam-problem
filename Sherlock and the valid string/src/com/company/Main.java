package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int count = 100000,flag = 0,first = 0,second = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int [27];
        for(int i = 0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<=26;i++)
        {
            if(second==arr[i]&&arr[i]!=0)
            {
                System.out.println("NO");
                return;
            }
            else if(arr[i]!=0 && !list.contains(arr[i]) )
            {
                flag++;
                list.add(arr[i]);
                if (flag==1)
                {
                    first = arr[i];
                }
                if(flag==2)
                {
                    second = arr[i];
                }

            }
            if(flag>2)
            {
                break;
            }
        }
        if (flag==1)
        {
            System.out.println("YES");
        }
        else if(flag==3)
        {
            System.out.println("NO");
        }else {
            if(Math.abs(first-second)==1)
            {
                System.out.println("YES");
            }else if (second==1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }


    }

}
