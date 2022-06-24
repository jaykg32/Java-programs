package Class_Introduction.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4,5.45,6.5);
//        Box box2 = new Box(box);
//        System.out.println(box.h+" "+box.w+" "+box.l);
//
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,8);
//        System.out.println(box3.h+" "+box3.weight);
// this reference  type of box and it is referencing to object of type Boxweight
//          Box       box5       =  new BoxWeight(2,3,4,6);
//        System.out.println(box5.w);
      //there are many variables in both parent and child classes
        //you are given access to variables that are in the rf type i.e. Boxweight
        //hence, you should have access to weight variable
        //this also means , that the ones you are trying to access should be intiialised
       //But here when the object itself is of type parent class, how will you call the constructor of child class
//        BoxWeight box6 = new Box();
//        System.out.println(box6);
        //Parent does not know what variables are below but the child class knows what variables are there in parent class


         BoxPrice box = new BoxPrice(5,6);
    }
}
