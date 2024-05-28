/**Question:-Create two thread.one thread is finding the average of the first 10 numbers and another thread is printing the square of the number stored in array arr-(1,20,50,15,30) and make sure both threads can execute simultaneously.
 * */

package thursdaylab;// stores the program in thursdaylab  package
class Thread1 extends Thread{// creating the thread1 class for printing the average
	public void run() { // run method overriding from thread class
		float sum=0;// sum variable to store addition of values
		for(float i=1;i<=10;i++) { //from 1 to 10
			sum=sum+i; // adding 1 to 10 and storing in sum variable
		}	
		float average=sum/10; // now to get average taking variable average 
		System.out.println("The average of 1 to 10 numbers is "+average); // printing average
	}
}
	
class Thread2 extends Thread{// creating Thread2 class for printing the square of array values
	public void run() { // run method overriding 
		int[] arr= {1,20,50,15,30};// the array int type values
		for(int i=0;i<arr.length;i++) { // for one one element printing  
			System.out.println("The Square of "+arr[i]+" is "+arr[i]*arr[i]);// prints the square directly 
		}
	}
}

public class MultiThread {// main class
	public static void main(String[] args) {// main thread is creating
		Thread1 t1=new Thread1();// child thread is creating of thread1
		Thread2 t2=new Thread2();//child thread is creating of thread1
		t1.start();// now calling start method from thread class 
		t2.start();// now calling start method from thread class 
		System.out.println("This is main thread");
	}
}

/**Output:-
The Square of 1 is 1
The Square of 20 is 400
The average of 1 to 10 numbers is 5.5
The Square of 50 is 2500
The Square of 15 is 225
The Square of 30 is 900
This is main thread
 * */
