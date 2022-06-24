package program;

import java.util.Scanner;

public class UniversityProgram1 {
    public static void main(String[] args) {
    class  Employee {
    int id;
    String name;
    float sal;
    int age;
    String department;
}
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many employee");
        int k = sc.nextInt();
        Employee emp[] = new Employee[k];
        for (int i = 0; i < k; i++) {
            emp[i] = new Employee();
            System.out.println("Enter "+(i+1)+" Employee data:");
            System.out.println("Enter employee id:"); //id
            emp[i].id= sc.nextInt();
            System.out.println("Enter employee name:"); //NAME
            emp[i].name=sc.next();
            System.out.println("Enter employee salary:"); //SALARY
            emp[i].sal=sc.nextFloat();
            System.out.println("Enter employee age:");   //AGE
            emp[i].age=sc.nextInt();
            System.out.println("Enter employee department");  //DEPARTMENT
            emp[i].department=sc.next();
        }
        System.out.println("All employee details are:");
        for (int i = 0; i < k; i++) {
            System.out.println("Employee id name salary age department:"+emp[i].id+" "+emp[i].name+" "+emp[i].sal+" "+emp[i].age+" "+emp[i].department);
        }

    }

}
