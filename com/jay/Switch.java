package com.jay;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
        //simplified style switch
//        switch (fruit) {
//            case "mango" -> System.out.println("yellow fruit");
//            case "apple" -> System.out.println("sweet red fruit");
//            case "orange" -> System.out.println("citrus fruit");
//            case "grapes" -> System.out.println("green fruit");
//            default -> System.out.println("wrong fruit name");
//        }
        //Switch without break use
//        int day = in.nextInt();
        //Weekdays and weekends
//        switch (day) {
//            case 1:
//                System.out.println(" Monday");
//            case 2:
//                System.out.println(" Tuesday");
//            case 3:
//                System.out.println(" Wednesday");
//            case 4:
//                System.out.println(" Thursday");
//            case 5:
//                System.out.println(" Friday");
//                System.out.println("These are weekdays");
//                break;
//            case 6:
//                System.out.println(" Saturday");
//            case 7:
//                System.out.println(" Sunday");
//                System.out.println("These are weekends");
//                break;
//        }
        //Same code with Enhanced switch statement
//        System.out.println("enter any day");
//        day = in.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("1");
//            case 2: System.out.println("2");
//            case 3: System.out.println("3");
//            case 4: System.out.println("4");
//            case 5: System.out.println("5");
//                System.out.println("These are weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println(" Saturday");
//                System.out.println(" Sunday");
//                System.out.println("weekends");
//                break;
//        }
//        Season Program
        int month=in.nextInt();
        String season;
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
                default:
                    season = "invalid season";
        }



    }
    }