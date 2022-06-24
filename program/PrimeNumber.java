package program;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter lower interval:");
        int i1 = in.nextInt();
        System.out.println("enter upper interval:");
        int i2 = in.nextInt();
        int r = 0, count = 0;
//        int count = 0, r;
//        for (int i = 1; i <= n; i++) {
//            r = n % i;
//            if (r == 0) {
//                count++;
//            }}

//        if (count == 2) {
//            System.out.println("prime number");
//        } else {
//            System.out.println("Not a prime number");
//        }
//    }}
        //Display prime numbers between to interval
        for (int i = i1; i <= i2; i++) {
            for (int j = 2; j <= i2; j++) {
                r = i % j;
                if (r == 0) {
                    count++;
                }
                System.out.println("loop1");
            }


        }

    }}





