package program;

import java.util.Scanner;

public class DivisibilityBy6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2==0 && n%3==0){
            System.out.println("number is divisible by 6");
            System.out.println(n/6);
        }
    }
}
