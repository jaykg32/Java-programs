package program;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        //Find leap year
        Scanner in = new Scanner(System.in);
        System.out.println("enter an Year");
        int year = in.nextInt();
        if (year%4==0){
            System.out.println( year+" is a leap year");
        }
        else {
            System.out.println(" not a leap year");
        }

    }
}
