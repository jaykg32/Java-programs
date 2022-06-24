package program;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input a,b,c
        System.out.println("enter a");
        int a = in.nextInt();
        System.out.println("enter b");
        int b = in.nextInt();
        System.out.println("enter c");
        int c = in.nextInt();
        double D,r1,r2;
        //formula of discriminant
        D = b * b - 4 * a * c;
        //Conditions of discriminant
        if (D < 0) {
            System.out.println("Roots are imaginary");
        } else if (D > 0) {
            System.out.println("Roots are real and unequal");
            r1 = (-b + sqrt(D)) / 2 * a;
            r2 = (-b - sqrt(D)) / 2 * a;
            System.out.println("root1 = " + r1);
            System.out.println("root2 = " + r2);
        } else {
            System.out.println("Roots are real and equal");
            r1 = (-b + sqrt(D)) / 2 * a;
            r2 = (-b - sqrt(D) )/ 2 * a;
            System.out.println("root1 = " + r1);
            System.out.println("root2 = " + r2);
        }


    }
}
