/*Write a program using ArrayDeque to add book names and add,delete the values from both ends of queue.
 * */
package thursdaylab;// package where this program will be stored

import java.util.ArrayDeque;//importing ArrayDequey to use in program

public class BookNames {// Booknames class for adding the book names at the end and deleting the names at the end and first

	public static void main(String[] args) {// main method from here start the program
		ArrayDeque<String> name=new ArrayDeque<String>();// creating ArrayDequeue 
		name.addFirst("Swings");// adding values at first
		name.addFirst("Ranktranjit");// adding values at first
		name.addLast("bhaskar");// adding values at Last
		name.addLast("purohit");// adding values at last
		name.addLast("Wings");// adding values at last
		name.addLast("Mentality");// adding values at last
		System.out.println("The ArrayDeque values before"+name);// original values print
		name.removeLast();// remove last 
		System.out.println("The ArrayDeque values after removing last value "+name);
		name.removeLast();//remove first
		System.out.println("The ArrayDeque values after removing first value "+name);

	}

}
/*The ArrayDeque values before[Ranktranjit, Swings, bhaskar, purohit, Wings, Mentality]
The ArrayDeque values after removing last value [Ranktranjit, Swings, bhaskar, purohit, Wings]
The ArrayDeque values after removing first value [Ranktranjit, Swings, bhaskar, purohit]*/
