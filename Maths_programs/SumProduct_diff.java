package Maths_programs;

import java.util.Scanner;

public class SumProduct_diff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int n = in.nextInt();
        int S=0,P=1,D,r;
        while (n!=0){
          r= n%10;
          P=P*r;
          S=S+r;
          n=n/10;
        }
        D=P-S;
        System.out.println("sum = "+S+" product = "+P);
        System.out.println(D);

    }
}
