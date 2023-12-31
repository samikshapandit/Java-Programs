/* Design a base class shape with two double type values and member functions to input the data and
compute_area() for calculating area of figure. Derive two classes’ triangle and rectangle. Make
compute_area() as abstract function and redefine this function in the derived class to suit their
requirements. Write a program that accepts dimensions of triangle/rectangle and display calculated area.
Implement dynamic binding for given case study. */

package test;
import java.util.Scanner;

abstract class Shape {
    double l, b;

    abstract public void compute_area();
}
    class rectangle extends Shape{
        Scanner sc =new Scanner(System.in);

        @Override
        public void compute_area() {
            System.out.println("Enter length:");
            l=sc.nextDouble();
            System.out.println("Enter width:");
            b=sc.nextDouble();
            System.out.println("Area is :" + (l*b));
        }
    }
   class triangle extends Shape{
    Scanner sc =new Scanner(System.in);

        @Override
        public void compute_area() {
            System.out.println("Enter base:");
            b=sc.nextDouble();
            System.out.println("Enter height:");
            l=sc.nextDouble();
            System.out.println("Area is :" + (0.5*b*l));
        }
    }

    public class test1 {
        public static void main(String[] args) {
            double l,b;
            int ch;
            Scanner sc = new Scanner(System.in);
            Shape s;
            rectangle r = new rectangle();
            triangle t =new triangle();
            do{
                System.out.println("1.Rectangle 2.Triangle");
                System.out.println("Enter shape");
                ch=sc.nextInt();
                switch(ch){
                    case 1:
                        s=r;
                        s.compute_area();
                        break;
                    case 2:
                        s=t;
                        s.compute_area();
                        break;
                }
            }while(ch!=3);
        }
}
