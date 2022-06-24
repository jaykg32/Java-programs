package Strings;

public class String_1 {
    public static void main(String[] args) {
        String name= "jay gupta";
        System.out.println(name);
        String a = "hot";
        System.out.println(a);
        String b ="cold";
        System.out.println(b);
       String c ="cold";
       String d =a;
        System.out.println(b==c); //true means they are pointing to the same object
        String name1 = new String("jay");
        String name2 = new String("jay");
        System.out.println(name1==name2); //false means they are pointing to the two different objects
        System.out.println(name1.equals(name2)); //checks the value of the string
        System.out.println(d==a);
        System.out.println(name2.charAt(1));
    }
}
