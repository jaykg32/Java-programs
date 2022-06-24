package Class_Introduction.Practice;

public class Class1 {
    public static void main(String[] args) {
        class Student{
            String name;
            String branch;
            int rollno;
           //Constructor
            public Student(String name, String branch, int rollno) {
                this.name = name;
                this.branch = branch;
                this.rollno = rollno;
            }
            //method
            void changeName(String name){
                this.name = name;
                System.out.println(name);

            }
        }
        //Create Objects
        Student s1 = new Student("jay","CSE",33);
        Student s2 = new Student("kushal","CSE",5);
        Student s3 = new Student("preksha","CSE",17);
        System.out.println(s1.name+" "+s1.branch+" "+s1.rollno);
        System.out.println(s2.name+" "+s2.branch+" "+s2.rollno);
        System.out.println(s3.name+" "+s3.branch+" "+s3.rollno);
        s1.changeName("jay kumar gupta");
        System.out.println(s1.name);



    }
}
