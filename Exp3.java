//Demonstration of Class, Objects, Methods
import java.util.Scanner;

class Rectangle{
    int length,breath;

    void getDim(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length:");
        length = sc.nextInt();
        System.out.println("Enter a breadth:");
        breath = sc.nextInt();
    }
    void area(){
        System.out.println("area of recatangle is:"+(length*breath));

    }
    void parameter(){
        System.out.println("parameter of recatangle is:"+(2*(length+breath)));
    }

}
public class Exp3{
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        r1.getDim();
        r1.area();
        r1.parameter();

    }
}