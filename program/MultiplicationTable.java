package program;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();
        System.out.println("enter number of times to calculate table");
        int N = in.nextInt();
        int ans;//number till table will run

        for (int i = 1; i <=N; i++) {
            ans =n*i;
            System.out.println(n+"*"+i +" = "+ans);
        }

    }
}
