package com.jay;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        //input three numbers
        System.out.println("Enter three numbers");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        //Method1 : Using else if ladder
        if (num1 > num2) {
            if (num2 > num3)
                System.out.println("num1 (" + num1 + ")is greatest");
        } else if (num2 > num3) {
            System.out.println(" num2(" + num2 + ")is greatest");
        } else {
            System.out.println("num3(" + num3 + ") is greatest");
        }

        //Method2.: using if statements
//        int max =num1;
//
//        if (num2>max){
//            max =num2;
//
//        }
//        if (num3>max){
//            max=num3;
//        }
//        System.out.println("the largest number is "+max);

        }
    }
