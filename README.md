# JAVA-OOP-LAB-
This file contain 12 probleums ON LAB conducted in college {programming using java language}
1. The grading system describes how well students have achieved the learning objectives or 
goals established for a class of course of study. This system helps to categorize the students 
according to their grades. Design a system that reads marks obtained by a student in a 
test of 100 marks and assign the grade.

Algorithm: 
Step 1: Initialize marks of student (between 0 to 100)  
Step 2: Using switch case display grade of the student 
Step 3: switch (marks/10) 
Step 3.1: Print the class of students according to 10 different cases. 
Step 3.2: Case 0, 1, 2, 3: Fail 
Step 3.3: Case 4: Pass 
Step 3.4: Case 5: Second Class 
Step 3.5: Case 6: First Class 
Step 3.6: Case 7, 8, 9, 10: Distinction 
Step 4: Stop 

2.Prime numbers are important because the security of many encryption algorithms are 
based on the fact that it is very fast to multiply two large numbers and get the result, 
while it is extremely computer-intensive to do the reverse. Enlist all the prime numbers 
between 1 and 1000 to create a base for cryptography. 

Step 1: Initialize i=1, num=1000, flag=1 
Step 2:  If i<=num  
Step 2.1: Initialize j=2 
Step 2.2: If j<i do 
Step 2.2.1: If i%j==0  
Step 2.2.1.1: Set flag=0 
Step 2.2.1.2: break 
Step 2.2.2: Increment j 
Step 2.3: if flag=1 
Step 2.3.1: Display i 
Step 2.4: Increment i 
Step 3: STOP 

3.The vendor provide a rubber material that provides the protection to the edges of 
rectangular object and paper material for protection of front and back of rectangular 
object. So a vendor needs an application to calculate the amount of rubber and paper 
material required for covering rectangular object. Write area method for calculating area 
of rectangle and square (using class and object). 

Algorithm: 
1. Start 
2. Declare a class named Rectangle 
3. Declare data members length and breadth 
4. Define a method getDim() to take input for data members  
5. Define a method area() to calculate area of Rectangle 
6. Declare a method perimeter() to calculate the perimeter of Rectangle 
7. Create object of Rectangle class and invoke methods of Rectangle class inside 
main() method 
8. Stop

4.School students need to study and learn formula for calculating area of different shapes 
like circle, rectangle, triangle and square. Design an application which will read require 
parameters for the area calculation of different shapes (use method overloading). 

Algorithm: 
1. Start 
2. Declare a class named Shapes 
3. Overload a method area(int) to calculate area of Square 
4. Overload a method area(int, int) to calculate area of Rectangle 
5. Overload a method area(int, int, int) to calculate area of Triangle 
6. Create object of Shapes class and invoke methods with different parameters inside 
main() method to achieve method overloading. 
7. Stop

5.An electrical engineer needs a complex number calculator for performing the operation of 
addition of alternating current represented using complex number. Create an application 
that takes 2 objects complex number as parameters and return the object which is addition 
of 2 numbers passed as parameter of complex number. 

Algorithm: 
Step 1: Start 
Step 2: Define class complex with 
Step 2.1: data members real and imaginary 
Step 2.2: default constructor to initialize real and imaginary to 0 
Step 2.3: parameterized constructor to initialize real and imaginary  
Step 2.4: void show() method to display complex number 
Step 2.5: Complex sum(Complex, Complex) method to perform addition of two 
complex numbers 
Step 3: Define main() method 
Step 3.1: Create object A, B and C of Complex class 
Step 3.2: Make a call to sum() and show() method 
Step 4: Stop 

6.2D array is used in many real-life applications where we need to organize data in 
tabular/matrix format. Hence a matrix manipulator is required with functionality of reading, 
displaying and flipping data from the matrix. Generate the methods, for the functionality 
mentioned above for creation the matrix manipulator. 

lgorithm: 
1. Create a class Matrix and declare two 2D array for addition and transpose of matrix 
and variables r, c, i, j are used.  
class Matrix 
{ 
int a[][],b[][],sum[][],t[][]; 
int r,c,i,j; 
2. Create a method read() and enter the elements for two matrices 
void read() 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter no. of rows and columns:"); 
r=sc.nextInt(); 
c=sc.nextInt(); 
a =new int[r][c];  
38 
39 
 
      b =new int[r][c];  
      System.out.println("Enter First Matrix:"); 
      for(i=0;i<r;i++) 
       { 
         for(j=0;j<c;j++) 
          { 
           //System.out.print("Enter data:"); 
            a[i][j]=sc.nextInt(); 
           } 
       } 
      System.out.println("Enter Second Matrix:"); 
      for(i=0;i<r;i++) 
       { 
         for(j=0;j<c;j++) 
          { 
            //System.out.print("Enter data:"); 
            b[i][j]=sc.nextInt(); 
           } 
       } 
    } //end of read 
3. Create a method addition() for the ddition of two matrices 
  void addition() 
   { 
      sum=new int[r][c];      
      for(i=0;i<r;i++) 
      for(j=0;j<c;j++) 
40 
 
           sum[i][j]=a[i][j]+b[i][j]; 
    } //end of addition 
4. Create another method display() to display the sum of matrices 
  void display() 
   { 
     for(i=0;i<r;i++) 
       { 
        for(j=0;j<c;j++) 
          System.out.print(sum[i][j]+" "); 
        System.out.println(); 
        } 
   } //end of display  
5. Create a method transpose() to transpose the matrix after the addition of two 
matrices. 
  void transpose() 
   { 
     t=new int[r][c];  
     for(i=0;i<c;i++) 
        for(j=0;j<r;j++) 
           t[i][j]=sum[j][i]; 
       for(i=0;i<r;i++) 
       { 
        for(j=0;j<c;j++) 
          System.out.print(t[i][j]+" "); 
        System.out.println(); 
        } 
} //end of transpose 
} //end of class Matrix 
6. Stop


  7. A character sequence is to be read as an input and result need to declare as “yes” or “no” 
by investigating the fact that traversing the characters sequence backwards and forwards 
results in same sequence. Write a program for the same using StringBuffer.

Algorithm: 
Step 1: Start.  
Step 2: Define class Palindrome.  
Step 3: Declare 2 String variables str and rev. 
Step 4: Take input from user for String str 
Step 5: Declare StringBuffer variable str1 using String str as a parameter 
Step 6: Reverse StringBuffer str1  
Step 7: Convert StringBuffer str1 to String and store it in String rev 
Step 8: if String str equals to String rev  
Step 8.1: Display String str is a palindrome 
Step 8.2: else display String str is not a palindrome 
Step 9: Stop 

8.Write a program to calculate volume of sphere using multilevel inheritance. The base class 
method will accept the radius from user. A class will be derived from the above mentioned 
class that will have a method to find the area of a circle derived from this will have method 
to calculate and display the volume of the sphere. 

Algorithm: 
Step 1: Start 
Step 2: Create base class Circle with method to accept radius from user. 
Step 3: Derive class Area from the base class with methods calculate() to calculate area 
and display() to display area. 
Step 4: Derive another class Volume from Area which will calculate volume of sphere 
and have method display () to display the volume. 
Step 5: Stop 

9.Consider a university where students who participate in the National Games or Olympics 
are given some grace marks. The grace marks provided are fixed and same for every 
student. Create an application that keeps student’s academic marks and Sports grace marks 
separate and generate total of marks considering academics and sports both. Also invoke 
methods of base class & interface using reference. (Hint: Make use of Interface). 

Algorithm: 
Step 1: Start 
Step 2: Create class Student 
2.1 Declare roll_no as int type 
2.2 Write getnumber() method to get roll number of a student 
2.3 Write putnumber() method to print roll number of a student 
Step 3: Define class test which extends student 
3.1 Declare sem1, sem2 as float type 
3.2 Write getmarks() method to get marks of a student 
3.3 Write putmarks() method to print marks of a student 
Step 4: Define interface sports 
4.1 Declare score of float type 
4.2 Declare putscore(); 
Step 5: Define class Result which extends test & implements sports 
5.1 Declare total of type float 
5.2.1 Write display() method; Calculate total of sem1,sem2 & score 
5.2.2 Invoke putnumber() ,putmarks(),putscore() methods  
55 
5.2.3 Print total 
5.3 Write putscore() method to display score 
Step 6: Define class Hybrid  
Step 7: Define Main method, Create object of class Result and Invoke getnumber(), 
getmarks(), display(). 
Step 8: Stop 

10.Through Custom exception user can raise application-specific error code. You are required 
to calculate a square of even number provided as input by user. However if a user provides 
an odd number as input, then an exception must be thrown explicitly with message 
indicating the input number must be even number. 

Algorithm: 
1. Start 
2. Create class OddException which extends Exception class 
3. Declare num as int type 
4. Write OddException(int x) constructor to get numbers as input. 
5. Write toString() method to display a message when exception is thrown. 
6. Create a class MyExceptionDemo with main function and Write static function 
OddNoException() throws OddException when number is odd. 
7. Define main method 
8. In try block 
9. Invoke OddException(3) 
10. In catch block 
11. Print catch exception 
12. Stop

11.Divide your program into two parts: One to read a number and the other to calculate its 
square. Provide a simultaneous execution of both parts of a program to maximum utilize 
the CPU time. 

Algorithm: 
1. Start 
2. Define class which implements Runnable interface.  
    2.1 Create Thread t1. 
    2.2 Create run( ) method to print 1 to 10 numbers 
           for( int i=1;i<=10;i++) 
           print i 
3. Define class which implements Runnable interface.  
    3.1 Create Thread t2. 
    3.2 Create run() method to print it’s square 
          for(int i=1;i<=10;i++) 
          print i*i 
4. Define class multithread 
5. Define main method 
6. Invoke t1.start( ) then t2.start( ) 
7. Stop

   12.Create a GUI application which is fully equipped with the functionality of solving various 
computation problems such as Addition, subtraction, Multiplication and Division. The GUI 
application should runs in a browser and displays the output as result of these 
mathematical operations.

Algorithm: 
1. Start 
2. Import the swing packages and awt packages. 
3. Create the class scientificcalculator that implements action listener. 
4. Create the container and add controls for digits, scientific calculations and decimal 
Manipulations. 
5. The different layouts can be used to lay the controls. 
6. When the user presses the control, the event is generated and handled. 
7. The corresponding decimal, numeric and scientific calculations are performed. 
8. Stop 
