/**Create a base class with constructor and inherit it in the derived class and call the base class constructor in derived class.
*/
class Parent{// parent class
    Parent(){// parent class constructor
        System.out.println("The constructor of Parent is called");
    }
}
class Child extends Parent{ //child class inherits the parent class
    Child(){// child class constructor
        super(); // calling parent class constructor
        System.out.println("The constructor of Child is called");
    }
}
class ConstructorExample{ // main class
    public static void main(String args[]){
        Child c1=new Child();//creating object and calls constructor
    }
}
/**
 * Output:-
 * D:\java>javac ConstructorExample.java
D:\java>java ConstructorExample
The constructor of Parent is called
The constructor of Child is called
 */
