package program;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        //Sum of n natural numbers
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of terms:");
        int n = in.nextInt();
//        int i=0,sum=0;
//        while (i<=n){
//            sum = sum +i;
//            i++;
//        }
//        System.out.println(sum);
        int fact=1, i =1;
        while (fact<=n){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);


    }
}
