package program;

import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        a= in.nextInt();
        b= in.nextInt();
        double c = Math.sqrt(a*a+b*b);
        System.out.println(c);

    }
}
