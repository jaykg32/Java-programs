package program;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        //Swap two numbers
        Scanner in = new Scanner(System.in);
        System.out.println("enter two integer");
        int a = in.nextInt();
        int b =in.nextInt();
        System.out.println("The two numbers are :  a= "+a+ " and b ="+b);
        int temp;
         temp = a;
         a=b ;
         b= temp;
        System.out.println("The two numbers after swapping are:a= "+a+" and b ="+b);


    }
}
