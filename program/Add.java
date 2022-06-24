package program;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        //Addition of two numbers
        Scanner in = new Scanner(System.in);
        System.out.println("enter two integer");
        int a = in.nextInt();
        int b =in.nextInt();
        System.out.println("The sum of "+ a+"+"+b +" is "+(a+b));
    }
}
