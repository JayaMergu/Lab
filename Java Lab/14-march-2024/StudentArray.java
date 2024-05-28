/**Create a class Student and implement array list and display details of student.
 */
import java.util.Scanner;// importing Scanner class
class StudentArray{ // creating class for Student details in array format
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        int id[]=new int[5];// creating array of id
        String name[]=new String[5];// creating array of name 
        for(int i=0;i<5;i++){// for taking the input from user
            System.out.println("Enter Student id: "); // for taking the input from user
            id[i]=sc.nextInt();
            System.out.println("Enter Student name: ");// for taking the input from user
            name[i]=sc.next();
        }
        for(int i=0;i<5;i++){// for printing the data
            System.out.println("The Student id  is: "+id[i]+" The name of student is: "+name[i]);
        }
    }
}
/**
 * Output:-
 * D:\java>javac StudentArray.java

D:\java>java StudentArray
Enter Student id:
1
Enter Student name:
jaya
Enter Student id:
2
Enter Student name:
luv
Enter Student id:
3
Enter Student name:
ram
Enter Student id:
4
Enter Student name:
shyam
Enter Student id:
5
Enter Student name:
sundar
The Student id  is: 1 The name of student is: jaya
The Student id  is: 2 The name of student is: luv
The Student id  is: 3 The name of student is: ram
The Student id  is: 4 The name of student is: shyam
The Student id  is: 5 The name of student is: sundar
 */
