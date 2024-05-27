/**3. Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle.

Formula:

Perimeter of a square = 4* s Perimeter of a rectangle = 2* (1 + b)

Perimeter of a circle = 2* (22/7)* r
*/
import java.util.Scanner;//importing a class Scanner 
class Perimeter{ // class for Perimeter calculation
    void perimeter(float side){ //method to calculate perimeter of Square
        double ans=4*side; // formula
        System.out.println("The Perimeter of Square is:"+ans);//printing
    }
    void perimeter(float length,float breadth){ //method to calculate perimeter of Rectangle
        double ans=2*(length+breadth);// formula
        System.out.println("The Perimeter of Rectangle is:"+ans);//printing
    }
    void perimeter(float radius,String s){ //method to calculate perimeter of Circle
        double ans=2*(22/7)*radius;// formula
        System.out.println("The Perimeter of Circle is:"+ans);//printing
    }
}
class UsePerimeter{// main method
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); // Scanner object creating to use
        Perimeter p1=new Perimeter();// object creation
        int choice;// choice for switch 
        System.out.println("1. Perimeter of Square 2.Perimeter of rectangle 3.Perimeter of Circle Choose one :");
        choice=sc.nextInt();//input from user the choice
        switch(choice){ 
            case 1://1 for square
                System.out.println("Enter the Square Side ");//taking th parameter from user
                float side=sc.nextFloat();//input
                p1.perimeter(side);//providing to method
            break;
            case 2:
                System.out.println("Enter the Length and breadth of Rectangle");//taking th parameter from user
                float length=sc.nextFloat();//input
                float breadth=sc.nextFloat();//input
                p1.perimeter(length,breadth);//providing to method
            break;
            case 3:
                System.out.println("Enter the Radius of Circle");//taking th parameter from user
                float radius=sc.nextFloat();//input
                p1.perimeter(radius,"circle");//providing to method
            break;
            default:
                System.out.println("Please Enter valid Choice");//for wrong choice
            break;
        }
    }
}
/**
 * Output:
 * D:\java>javac UsePerimeter.java

D:\java>java UsePerimeter
1. Perimeter of Square 2.Perimeter of rectangle 3.Perimeter of Circle Choose one :
1
Enter the Square Side
3
The Perimeter of Square is:12.0

D:\java>java UsePerimeter
1. Perimeter of Square 2.Perimeter of rectangle 3.Perimeter of Circle Choose one :
2
Enter the Length and breadth of Rectangle
2 5
The Perimeter of Rectangle is:14.0

D:\java>java UsePerimeter
1. Perimeter of Square 2.Perimeter of rectangle 3.Perimeter of Circle Choose one :
3
Enter the Radius of Circle
3.14
The Perimeter of Circle is:18.84000015258789
 */