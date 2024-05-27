/*Write a Java program to check whether a HashMap contains key-value mappings (empty) or not.
 * */
package thursdaylab;// putting class in package

import java.util.HashMap;

public class HashMapExample {// class

	public static void main(String[] args) {// main method 
		HashMap<Integer,String> s1=new HashMap<Integer,String>();//Creating HashMap  
		s1.put(1, "jaya");// adding value with key
		if(s1.isEmpty()) {// isEmpty function to check if the HashMap is Empty or not
			System.out.println("HashMap is empty");// printing by condition satisfaction
		}else {
			System.out.println("HashMap is Not Empty");// printing by condition 
		}
	}

}
/*Output:-
 * HashMap is Not Empty
 * */