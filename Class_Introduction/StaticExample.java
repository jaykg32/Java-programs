package Class_Introduction;

public class StaticExample {
    static int a =4;
    static  int b;
//Static block will only run once when the first object is created i.e.
// when the class is loaded for the first time
   static {
   System.out.println("I am a static block");
        b= a*5;
    }

    public static void main(String[] args) {
       //First object
        StaticExample obj = new StaticExample();
        //Static variables can be accessed by calling with the class name ClassName.VariableName
        System.out.println(StaticExample.a+" "+StaticExample.b);
        StaticExample.b+=3;
        System.out.println(StaticExample.a+" "+StaticExample.b);
         //second object
        StaticExample obj2 = new StaticExample();
        System.out.println(StaticExample.a+" "+StaticExample.b);

   }

}
