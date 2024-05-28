/**Write a program to demonstrate static block take two static variables name and id and print them.
 */
class StudentDetails{// student details class
    static int id=1; // static variable
    static String name="jaya";// static variable
}
class Student1 extends StudentDetails{ // inheriting 
    void printData(){
        System.out.println("The Student1 id is"+id); //printing the data
        System.out.println("The Student1 name is"+name);//printing the data
    }
}
class Student2 extends StudentDetails{// inheriting 
    void printData(){
        System.out.println("The Student2 id is"+id); //printing the data
        System.out.println("The Student2 name is"+name);//printing the data
    }
}
class UseStudentDetails{// main method class
    public static void main(String args[]){
        Student1 s1=new Student1();// creating object
        Student2 s2=new Student2();
        s1.printData();// calling methods
        s2.printData();// calling methods
        s2.id=2;// tring to modify the static value
        s2.name="July";// tring to modify the static value
        s1.printData();// and again  calling methods to check changes
        s2.printData();// and again  calling methods to check changes

    }
}
/**
 * Output:-
 * D:\java>javac UseStudentDetails.java
D:\java>java UseStudentDetails
The Student1 id is1
The Student1 name isjaya
The Student2 id is1
The Student2 name isjaya
The Student1 id is2
The Student1 name isJuly
The Student2 id is2
The Student2 name isJuly
 */