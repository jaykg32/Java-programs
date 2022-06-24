package Class;


    class BoxCalc {
        double width;
        double height;
        double depth;
        //compute and return volume
        double volume(){
            return width*height*depth;
        }
        //set dimensions of box
        void Setdim(double w,double h,double d){
            width=w;
            height=h;
            depth=d;
        }
    }
   public class Box_parameters {

    public static void main(String[] args) {
       BoxCalc  box1 = new BoxCalc();
       BoxCalc  box2 = new BoxCalc();
        double vol;

        vol = box1.volume();
        System.out.println(vol);

        //initialize each box
        box1.Setdim(2,4,5);
        box2.Setdim(4,7,3);

        //get volume of box
        vol = box1.volume();
        System.out.println(vol);

        vol = box2.volume();
        System.out.println(vol);


    }
}
