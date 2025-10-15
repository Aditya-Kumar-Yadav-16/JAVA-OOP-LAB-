//Demonstration of Branching Statement 

import java.util.*;
public class Exp1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int marks=sc.nextInt();
        switch(marks/10){
            case 10:
            case 9:
            case 8:
            case 7:
            System.out.println("Distinction");
            break;
            case 6:
            System.out.println("First Class");
            break;
            case 5:
            System.out.println("Second Class");
            break;
            case 4:
            System.out.println("Pass ");
            break;
            default:
            System.out.println("fail");
            break;

        }
    }
}
