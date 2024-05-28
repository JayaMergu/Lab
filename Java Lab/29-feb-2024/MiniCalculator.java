/**WAP for creating the mini calculator. you have to perform an operation on the basis of user choice until the user press yes to continue(add, mul, sub, div)
*/
import java.util.Scanner;
class MiniCalculator{// class mini Calculator to perform arithmetic operations
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a,b,ans; // attributes for operation and operand
        int flag=0,choice,choice1; // choice of user for operation and continue
        while(flag==0){// in while for contiues loop 
            System.out.println("Enter The values no1 and no2:");
            a=sc.nextDouble();
            b=sc.nextDouble();// taking values as input from user
            System.out.println("Enter 1.Add 2.Mul 3.Sub 4.Div ");
            choice=sc.nextInt(); // operation choice
            if(choice==1){
               ans=a+b; //add
               System.out.println("The addition of two number is:"+ans); 
            }else if(choice==2){
               ans=a*b;// mul
               System.out.println("The multiplication of two number is:"+ans); 
            }else if(choice==3){
               ans=a/b;//div
               System.out.println("The division of two number is:"+ans); 
            } else if(choice==4){
               ans=a-b;//sub
               System.out.println("The substraction of two number is:"+ans); 
            }else 
            System.out.println("please enter valid choice"); //from wrong choice
            System.out.println("Do you want to Continue 1.No 2.Yes"); // for user want to continue
            choice1=sc.nextInt();
            if(choice1==2){
                flag=0;
            }else
                flag=1; // if no then flag change and out of while
        }

    }
}
/**output:
 * D:\java>javac MiniCalculator.java
D:\java>java MiniCalculator
Enter The values no1 and no2:
2 2
Enter 1.Add 2.Mul 3.Sub 4.Div
1
The addition of two number is:4.0
Do you want to Continue 1.No 2.Yes
2
Enter The values no1 and no2:
2 2
Enter 1.Add 2.Mul 3.Sub 4.Div
2
The multiplication of two number is:4.0
Do you want to Continue 1.No 2.Yes
2
Enter The values no1 and no2:
2 2
Enter 1.Add 2.Mul 3.Sub 4.Div
3
The division of two number is:1.0
Do you want to Continue 1.No 2.Yes
2
Enter The values no1 and no2:
2 2
Enter 1.Add 2.Mul 3.Sub 4.Div
4
The substraction of two number is:0.0
Do you want to Continue 1.No 2.Yes
1
D:\java>
 */
