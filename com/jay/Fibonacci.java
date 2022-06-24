package com.jay;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=0,b=1,num;
        System.out.println("enter the value of n");
        int n =in.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (int i=0; i <n ; i++) {
            num=a+b;
            System.out.println(num);
            a=b;
            b=num;
        }
        System.out.println("the "+n +"th number is :" + b);

    }
}
