package com.jay;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

    //name, department,age salary
    //difference between instance variable and object?
    Scanner in = new Scanner(System.in);
        //NAME
        for (int i=0; i <5; i++) {

            System.out.println("Enter employee "+i +" age");
            int age = in.nextInt();

            System.out.println("Enter employee "+i +" salary");
            float salary = in.nextFloat();

            System.out.println("Enter employee "+i +" name");
            String name = in.nextLine();

            System.out.println("Enter employee "+i +" department");
            String dept = in.nextLine();

            System.out.println("Employee"+i+" age is " + age);
            System.out.println("Employee"+i+" salary is " + salary);
            System.out.println("Employee"+i+" name is " + name);
            System.out.println("Employee"+i+" department is " + dept);


        }


}


}