//Method Overloading 
class Shape{
    void area(int a){
        System.out.println("area of square is:"+(a*a));
    }
    void area(int l,int b){
        System.out.println("area of rectangle is:"+(l*b));
    }   
    void area(double r){
        System.out.println("area of circle is:"+(3.14*r*r));
    }
}
public class Exp4{
    public static void main(String args[]){
        Shape s1=new Shape();
        s1.area(23);
        s1.area(2,4);
        s1.area(2.456);
    }
}