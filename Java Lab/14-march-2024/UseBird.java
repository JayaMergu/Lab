/**Define interfaces "Flyable" and "Swimmable with methods fly() and swim() respectively. Implement these interfaces in a class 'Bird" to demonstrate multiple interface implementation.
 */
interface Flyable{ // Flyable interface
   public void fly(); // fly abstract method
}
interface Swimmable{// Swimmable interface
    public void swim(); // swim abstract method
}
class Bird implements Flyable,Swimmable{ // bird class which implemets the Flyable and Swimmable class and gives body to methods 
    public void fly(){ // giving body to Fly method 
        System.out.println("This is overriden method of Flyable class fly method in Bird class");
    }
    public void swim(){// giving body to swim method 
        System.out.println("This is overriden method of Swimmable class swim method in Bird class");
    }
}
class UseBird{// UseBird class for creating object
    public static void main(String args[]){
        Bird b1=new Bird(); // creating object of Bird
        b1.fly();//calling fly method through object 
        b1.swim();//calling swim method through object 
    }
}
/**
 * Output:-
 * D:\java>javac UseBird.java
D:\java>java UseBird
This is overriden method of Flyable class fly method in Bird class
This is overriden method of Swimmable class swim method in Bird class

 */