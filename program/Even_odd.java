package program;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        //Check even odd
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number ");
        int num  = in.nextInt();
        if (num%2==0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }

    }
}
