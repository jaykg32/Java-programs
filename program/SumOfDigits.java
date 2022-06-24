package program;

import java.util.Scanner;
//Add sum of digits of a number
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        int r,sum=0;
        while (n>0){
            r=n%10;
            n=n/10;
            sum += r;
        }
        System.out.println("the sum of the digits of "+n+" is "+sum);
    }
}
