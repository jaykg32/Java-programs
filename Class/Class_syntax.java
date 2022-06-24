package Class;

public class Class_syntax {
    public static void main(String[] args) {
        box box1 = new box(); //Creating an box object called box1
        double vol ;
        //className objectName = new className();
        box box2 = new box(); //Created 2nd object box2
        box box3 = new box();//Created 3rd object box3
         box3= box2; //assigning values of box2 to box3
        //assigning values to box1's instance variables
        box1.width =12.5;
        box1.height =42;
        box1.depth =12;
        //assigning values to box2's instance variables
        box2.width =5;
        box2.height =2;
        box2.depth =13;
        //assiginig values to box3's instance variables

        //compute volume of box1
        vol = box1.width* box1.height* box1.depth;
        System.out.println("volume of box1 is :"+ vol);
        //compute volume of box2
        vol = box2.depth* box2.height* box2.width;
        System.out.println("volume of  box2 is:"+ vol);
        System.out.println(box3.depth+"" +box3.height+"" +box3.width);
        System.out.println(box2.depth+"" +box2.height+"" +box2.width);
        //using method to print volume
        box1.volume(1);
        box2.volume(2);
        box3.volume(3);
    }
    static class box { //Created a class called box
        double width; //instance variables
        double height;
        double depth;

        void volume(int num){
            System.out.println("Volume of box "+num +" is   :");
            System.out.println(width*height*depth);

        }
    }
}
