/**Question:-2. Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.

[Hint: Use array and loop and try to access the element beyond the last index].
 * */
package thursdaylab;
public class ArrayException {// creating a class for 
	public static void main(String[] args) {// main method
	int[] arr= {1,2,3,4,5};// array of size 5 is created
	try {// try block to the line of program which gives exception
		for(int i=0;i<=7;i++) { //loop and giving out of bound value to get exception
			System.out.println(" "+arr[i]); //trying to print the values of index 7 which gives exception ArrayIndexOutOfBoundsException
		}
	}
	catch(ArrayIndexOutOfBoundsException ex) { // catch block to handle the exception 
		System.out.println(ex+" Please enter the value from size");// handling the exception  
	}
	
	System.out.println("The Exception is handled and came to end of the program");// to print the statement that exception is handled and program is run sucessfully 
	}
}
/**Output:-
1
2
3
4
5
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 Please enter the value from size
The Exception is handled and came to end of the program
 * */
