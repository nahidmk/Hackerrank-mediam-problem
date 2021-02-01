package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int row = mk.nextInt()+2,col = mk.nextInt()+2,second = mk.nextInt();
        char arr[][] = new char[row][col];
        char even_arr[][] = new char[row][col];
        char arr_5[][] = new char[row][col];

        for (int i = 1;i<row-1;i++)
        {
            String s = mk.next();int c = 0;
            for(int j = 1;j<col-1;j++)
            {
                arr[i][j] = s.charAt(c);
                c++;
                even_arr[i][j] = 'O';
                arr_5[i][j] = 'O';

            }
        }

        for (int i = 1;i<row-1;i++)
        {
            for (int j = 1;j<col-1;j++)
            {
                if(arr[i][j]=='O')
                {
                    even_arr[i][j] = even_arr[i-1][j] =  even_arr[i+1][j] = even_arr[i][j+1] = even_arr[i][j-1] = '.';
                }

            }

        }
        for (int i = 1;i<row-1;i++)
        {
            for (int j = 1;j<col-1;j++)
            {
                if(even_arr[i][j]=='O')
                {
                    arr_5[i][j] = arr_5[i-1][j] = arr_5[i+1][j] =   arr_5[i][j+1] = arr_5[i][j-1] =  '.';
                }

            }

        }



        if(second%2==0)
        {
            for (int i = 1;i<row-1;i++)
            {
                for(int j = 1;j<col-1;j++)
                {
                    System.out.print("O");
                }
                System.out.println();
            }
            return;
        }
        if(second==1)
        {
            for (int i = 1;i<row-1;i++)
            {
                for (int j = 1;j<col-1;j++)
                {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
            return;
        }
        if(second%4==3)
        {
            for (int i = 1;i<row-1;i++)
            {
                for (int j = 1;j<col-1;j++)
                {
                    System.out.print(even_arr[i][j]);
                }
                System.out.println();

            }
            return;

        }
        if(second%4==1)
        {

            for (int i = 1;i<row-1;i++)
            {
                for (int j = 1;j<col-1;j++)
                {
                    System.out.print(arr_5[i][j]);

                }
                System.out.println();

            }
            return;
        }
    }
}
