package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner mk = new Scanner(System.in);
        int t = mk.nextInt();
        while (t-->0)
        {
            int n = mk.nextInt(),k = mk.nextInt(),flag = 0;
            int arr[] = new int[n];
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<n;i++)
            {
                arr[i] = mk.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 0;i<n;i++)
            {
                list.add(mk.nextInt());
            }
            Collections.sort(list, Collections.reverseOrder());
            for (int i = 0;i<n;i++)
            {
                if(arr[i]+list.get(i)>=k)
                {

                }else {
                    flag = 1;
                    break;
                }
            }
            if (flag!=0)
            {
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }

        }
    }
}
