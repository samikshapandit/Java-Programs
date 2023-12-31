/* Design a class ‘Complex’ with data members for real and imaginary part. Provide default and
Parameterized constructors. Write a program to perform arithmetic operations of two complex numbers*/

package test;

import java.util.Scanner;

class Complex{
    float real;
    float imag;

    Complex()
    {
        real=0;
        imag=0;
    }

    Complex(float r,float i)
    {
        real=r;
        imag=i;
    }
    void add(Complex c1,Complex c2)
    {
        Complex c3=new Complex();
        c3.real=c1.real+c2.real;
        c3.imag=c1.imag+c2.imag;
        System.out.println("Addition:"+c3.real+ "+"+c3.imag +"i");
    }

    void subtract(Complex c1,Complex c2)
    {
        Complex c3=new Complex();
        c3.real=c1.real-c2.real;
        c3.imag=c1.imag-c2.imag;
        System.out.println("Subtraction:"+c3.real+ "+"+c3.imag +"i");
    }
    void multiply(Complex c1,Complex c2)
    {
        Complex c3=new Complex();
        c3.real=c1.real*c2.real-c2.imag*c1.imag;
        c3.imag=c1.imag*c2.real+c2.imag*c1.real;
        System.out.println("Multiplication:"+c3.real+ "+"+c3.imag +"i");
    }
    void div(Complex c1,Complex c2){
        Complex c3=new Complex();
        c3.real=((c1.real*c2.real+c1.imag*c2.imag)/(c2.real*c2.real)+(c2.imag*c2.imag));
        c3.imag=((c1.imag*c2.real-c1.real*c2.imag)/(c2.real*c2.real)+(c2.imag*c2.imag));
        System.out.println("The Division is" + " : " + real + imag + "i");
    }
}
class test1
{
    public static void main(String[] args) {
        float n1,n2;
        int ch,y;
        Scanner sc= new Scanner(System.in);
        Complex obj = new Complex();
        do{
            System.out.println("Enter first no:\n");
            n1=sc.nextFloat();
            n2=sc.nextFloat();
            Complex c1=new Complex(n1,n2);
            System.out.println("Enter 2nd no:\n");
            n1=sc.nextFloat();
            n2=sc.nextFloat();
            Complex c2=new Complex(n1,n2);
            System.out.println("Enter choice:");
            System.out.println("1.Add 2.Sub 3.Mul 4.Div");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    obj.add(c1,c2);
                    break;
                case 2:
                    obj.subtract(c1,c2);
                    break;
                case 3:
                    obj.multiply(c1,c2);
                    break;
                case 4:
                    obj.div(c1,c2);
                    break;
            }
            System.out.println("Continue?");
            y=sc.nextInt();
        }while (y==1);
    }
}


