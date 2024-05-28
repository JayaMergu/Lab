/**Create a class named Car with attributes make, model, year, and color. Include a method start() that prints "Car started" and a method stop() that prints "Car stopped"
*/
class Car{// car class
    String make,model,color; // attributes 
    int year;
    Car(String make,String model,String color,int year){ // constructor for attributes taking and printing
        this.make=make;
        this.model=model;// allocating 
        this.color=color;
        this.year=year;
        System.out.println("The make: "+make+" model: "+model+" color: "+color+" year: "+year);// printing the data
    }
    void start(){// to start the car
        System.out.println("Car started");
    } 
    void stop(){// to stop the car
        System.out.println("Car stopped");
    }
}
class UseCar{
    public static void main(String args[]){
        Car c1=new Car("tokyo","toyota","yellow",2003);// object creation
        c1.start();// calling methods through object
        c1.stop();// calling method
    }
}
/**
 * 
D:\java>javac UseCar.java
D:\java>java UseCar
The make: tokyo model: toyota color: yellow year: 2003
Car started
Car stopped
D:\java>

 */