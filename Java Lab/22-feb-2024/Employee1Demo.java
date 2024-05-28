/** Create a class named Employee with attributes name, EmployeeId,designation , and salary. Include methods calculateBonus() that returns 5% of the salary as bonus
*/
import java.util.Scanner;
class Employee1{ // creating class as Employee
    String name; // attributes of Employee that are required
    String designation;
    int id;
    double salary;
    void getData(){ // method to get the details from user 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the Employee:");
        name=sc.nextLine();
        System.out.println("Enter designation of the Employee:");
        designation=sc.nextLine();
        System.out.println("Enter id no of Employee:");
        id=sc.nextInt();
        System.out.println("Enter salary of the Employee:");
        salary=sc.nextDouble();
    }
    void setData(){ // method to display the data and set the data
        this.name=name;
        this.designation=designation;
        this.id=id;
        this.salary=salary;
        System.out.println("The name of Employee is:"+this.name);
        System.out.println("The designation of the Employee is:"+this.designation);
        System.out.println("The id no of Employee is:"+this.id);
        System.out.println("The salary of Employee is:"+this.salary);
    }
    void calculateBonus(){ // to calculate the bonus method 
        double bonus = salary * 0.05;
        System.out.println("The bonus of Employee is:"+bonus);
    }
}
class Employee1Demo{ // main class
    public static void main(String args[]){
        Employee1 e1=new Employee1(); // object creating as e1
        e1.getData();
        e1.setData();// methods calling with object
        e1.calculateBonus(); // calling the bonus method for bonus
    }
}