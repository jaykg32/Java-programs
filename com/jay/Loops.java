package com.jay;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
       1.FOR Loop
        for (int num = 1; num<=5  ;num++) {
            System.out.println(num);
        }
//      2.Print numbers from 0 to n
*/
        System.out.println("enter limit");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int num = 0; num <= n ; num++) {
            System.out.print(num + " ");
        }

/* 3.While loop
        syntax:
        while (condition){
       //body
       } */
//        int num =1;
//        while (num<6){
//            System.out.println(num +" ");
//            num++;
//        }
        /*
        do{
        }while(condition)
        */
//        int n=6;
//          do {
//              System.out.println(n);
//              n++;
//          }while (n<=10);







    }
}
