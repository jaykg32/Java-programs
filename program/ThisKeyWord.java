package program;

public class ThisKeyWord {
   static class Test{
        int a;
        int b;
        //parameterized constructor
        Test (int a,int b){
            this.a=a;
            this.b=b;
        }
        void display(){
            System.out.println("a = "+a+" b = "+b );
        }

    }
    public static void main(String[] args) {
        Test object1 = new Test(10,11);
        object1.display();

    }
}
