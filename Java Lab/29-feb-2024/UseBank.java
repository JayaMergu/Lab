/**Implement a bank account class showing method overloading with method for deposit, withdrawal, and balance inquiry.
 * Use method overloading to handle different types of transactions.
*/
import java.util.Scanner;
class Bank{ // class bank 
    double amount=100000; // initially setting the amount of balance
    double a; // attribute to perform operation
    void transaction(){ // to show balance need no parameter
        System.out.println("Welcome the amount in your account is: "+amount);
    }
    void transaction(int a){// to withdraw we cant withdraw in paise only in notes 
        Scanner sc=new Scanner(System.in);
        System.out.println("You can only withdraw 1000 in a day and can withdraw money only in notes");
        System.out.println("Please enter the withdrawl amount: ");
        a=sc.nextInt();// amount to withdraw from userinput
        amount=amount-a;// operation of withdrawl
        System.out.println("The amount withdrawl from your account is: "+a);

    }
    void transaction(double a){// to deposite in float values
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of deposite ");
        a=sc.nextDouble(); // amout taking from user
        amount=amount+a; // function of depodite
        System.out.println("The amount is deposited your account which is: "+a);// done
    }
}
class UseBank{
    public static void main(String args[]){
        Bank b=new Bank();//crating object
        b.transaction(100);// calling withdraw method
        b.transaction(10.23);// calling deposite method
    }

}
/**
 * Output:
 * 
D:\java>java UseBank
You can only withdraw 1000 in a day and can withdraw money only in notes
Please enter the withdrawl amount:
200
The amount withdrawl from your account is: 200
Enter the amount of deposite
588
The amount is deposited your account which is: 588.0
D:\java>
 */