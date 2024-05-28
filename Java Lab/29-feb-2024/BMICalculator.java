/**A program that calculates Body Mass Index (BMI) based on user input of weight and height, and then categorizes the BMI into underweight, normal, overweight, or obese categories using if-else statements.
*/
import java.util.Scanner;
class BMICalculator{// class BMI Body Mass Index
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    float weight,height,bmi; // attributes of BMI Calculation
    System.out.println("Enter the weight in kilogram and height in meters of user: ");
    weight=sc.nextFloat();
    height=sc.nextFloat();// input from user 
    bmi=(weight/(height*height));// formula of bmi
    System.out.println(bmi);
    if (bmi < 18.5) {// based on the bmi telling user the Body type
            System.out.println("Underweight");
        } else if (bmi < 25) { // based on this 
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
/**Output:-
 * 
D:\java>javac BMICalculator.java

D:\java>java BMICalculator
Enter the weight in kilogram and height in meters of user:
70 170
0.0024221453
Underweight

D:\java>java BMICalculator
Enter the weight in kilogram and height in meters of user:
70 1.75
22.857143
Normal weight

D:\java>java BMICalculator
Enter the weight in kilogram and height in meters of user:
70 2
17.5
Underweight

D:\java>java BMICalculator
 */
