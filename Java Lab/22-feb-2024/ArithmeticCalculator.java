/**WAP to create a simple calculator program that takes user input for two 
numbers and an operator (+, -, *, /) and performs the corresponding arithmetic
 operation using conditional statements.
*/
import java.util.Scanner;
class ArithmeticCalculator{ // class for doing the arithmetic operations
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no1; // attributes required for operation
        int no2;
        float ans;
        int choice; // to choose which operation to do
        System.out.println("Enter No one :");// taking input values
        no1=sc.nextInt();
        System.out.println("Enter No two :");
        no2=sc.nextInt();
        System.out.println("1:ADD 2:SUBSTRACTION 3:MULTIPLICATION 4:DIVISION\nEnter your choice");
        choice=sc.nextInt();// taking choice
        if(choice==1){  // based on choice operation performing
            ans=no1+no2;
            System.out.println("the addition is:"+ans);
        }else if(choice==2){
            ans=no1-no2;
            System.out.println("the substraction is:"+ans);
        }else if(choice==3){
            ans=no1*no2;
            System.out.println("the multiplication is:"+ans);
        }else if(choice==4){
            ans=no1/no2;
            System.out.println("the division is:"+ans);
        }
    }
}
