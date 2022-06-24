package Class;

public class Box_set {
    public static void main(String[] args) {
        box box1= new box();
        box box2=new box();
        box box3= new box();
        double vol;
        //display volume
        box1.setdim(10,3,2);
        box2.setdim(3,5,6);
        vol= box1.volume();
        System.out.println("volume of box 1 is " +vol);
        vol = box2.volume();
        System.out.println("volume of box 2 is " +vol);
    }
    static class  box{
        double height;
        double width;
        double depth;
        void setdim(double w,double h ,double d){
            width=w;
            height=h;
            depth=d;
        }
        double volume() { //function
            return width*height*depth;
        }
    }

}
