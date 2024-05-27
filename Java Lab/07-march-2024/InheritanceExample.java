/**2. Create a program in java to implement multilevel inheritance and hierarchical inheritance

Take classes like: Doctor, Surgeon and Nurse I Create methods and show method overriding.           

*/
class Doctor{// super class
    void work(){ // original method
        System.out.println("Hello! The Doctors work is to treat patients ");
    }
}
class Surgeon extends Doctor{//child class inheriting the super class
    void work(){ // method overriding
        System.out.println("Hello! The Surgeon work is Operation doing on patients ");   
    }
}
class Nurse extends Surgeon{ //child class inheriting the super class
    void work(){ // method overriding
        System.out.println("Hello! The Nurse work is to Help in surgeon");
    }
}
class Patient extends Doctor{ //child class inheriting the super class
    void work(){ // method overriding
        System.out.println("Hello! The Nurse work is to follow the instruction of Doctor");
    }
}
class InheritanceExample{ // main class
    public static void main(String args[]){
        Doctor d1=new Doctor(); // creating object
        Surgeon s1=new Surgeon(); // creating object
        Nurse n1=new Nurse(); // creating object
        Patient p1=new Patient(); // creating object
        d1.work();// calling method using the object 
        s1.work(); // calling method using object
        n1.work(); // overriding 
        p1.work(); // overriding
    }
}
/**
 * Output:
 * D:\java>javac InheritanceExample.java

D:\java>java InheritanceExample
Hello! The Doctors work is to treat patients
Hello! The Surgeon work is Operation doing on patients
Hello! The Nurse work is to Help in surgeon
Hello! The Nurse work is to follow the instruction of Doctor
 */
