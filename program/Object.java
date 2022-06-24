package program;

public class Object {
    public static class  CountObject { //class
        //variable to keep track of object
       private static  int count = 0 ;
        //constructor of the class
        public CountObject (){
          count++;
        }
    }
    public static void main(String[] args) {
     CountObject obj1 = new CountObject();
     CountObject obj2 = new CountObject();
     CountObject obj3= new CountObject();
     CountObject obj4 = new CountObject();
     System.out.println("Total number of objects:"+ CountObject.count);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
    }
}
