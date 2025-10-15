//Constructor Overloading 

import java.util.*;


class Complex {
    
    double real, imaginary;

   
    Complex() {
        real = 0;
        imaginary = 0;
    }


    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    
    void show() {
        System.out.println(real + " + " + imaginary + "i");
    }

   
    Complex sum(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }
}

public class Exp5 {
    public static void main(String args[]) {
       
        Complex A = new Complex(2, 3);
        Complex B = new Complex(4, 5);
        Complex C = new Complex(); 

        C = C.sum(A, B);

        System.out.print("Complex Number A: ");
        A.show();

        System.out.print("Complex Number B: ");
        B.show();

        System.out.print("Sum of A and B: ");
        C.show();
    }
}
