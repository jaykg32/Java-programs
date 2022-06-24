package com.jay;

import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
      int r,ans=0;
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
      while (n!=0)
      {
          r=n%10;
          n=n/10;
          ans = (ans * 10) + r;
      }
        System.out.println("Reverse number is: "+ans);

    }
}
