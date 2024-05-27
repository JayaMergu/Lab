/*Write a program using Vector to store the list of students details and print the details.
*/
package thursdaylab;// package name
import java.util.Iterator;// importing the Iterator for using in the program
import java.util.Vector;// importing the Iterator for using in the program
class Student{// Class Student for details and constructor creation
	String name;// attributes of student
	int id;// attributes of student
	String department;// attributes of student
	public Student(String name,int id,String department) {// parameterized Constructor 
		this.name=name;//
		this.id=id;
		this.department=department;
	}
}

public class StudentDetail {// main class

	public static void main(String[] args) {// main method
		Vector<Student> s1 = new Vector<>();// Vector creation
		s1.add(new Student("Jaya",1,"CSE"));// adding values to Vector 
		s1.add(new Student("pranali",2,"IT"));// adding values to Vector 
		s1.add(new Student("Nandini",3,"IT"));// adding values to Vector 
		s1.add(new Student("Akkanksha",4,"IT"));// adding values to Vector 
		Iterator<Student> itr=s1.iterator();//Iterator creating and assigning to object of Vector
		while(itr.hasNext()) {// method to print values
			Student student = itr.next();// to check next value
	           System.out.println(student.name + " " + student.id + " " + student.department);// printing data
		}
	}

}
/*Output:-
Jaya 1 CSE
pranali 2 IT
Nandini 3 IT
Akkanksha 4 IT

 * */
