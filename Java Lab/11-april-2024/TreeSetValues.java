/*Write a program using TreeSet insert Integer values and print them.
 * */

package thursdaylab;

import java.util.Iterator;//importing Iterator to use in program
import java.util.TreeSet;//importing TreeSet to use in program

public class TreeSetValues {// class to do functions in given question

	public static void main(String[] args) {// main method from where program starts
		TreeSet<Integer> tr=new TreeSet<Integer>();// creating ArrayDequeue
		tr.add(20);// Adding value to TreeSet
		tr.add(30);// Adding value to TreeSet
		tr.add(40);// Adding value to TreeSet
		tr.add(50);	// Adding value to TreeSet
		tr.add(70);// Adding value to TreeSet
		tr.add(20);// Adding value to TreeSet
		Iterator<Integer> it=tr.iterator();//iterator to iterate 
		while(it.hasNext()){
			System.out.println(it.next());// printing values
		}
	}

}
/*Output:-
20
30
40
50
70
 * */
