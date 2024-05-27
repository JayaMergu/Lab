/*Write a program to declare stack.Store 10 elements into it.Remove 4 elements from
stack and display it.*/
package com.collectionframeworkexample;//storing program in package
import java.util.Stack;// importing required classes;
public class StackExample1 {//class for Stack operation

	public static void main(String[] args) {// main method
		Stack<Integer> s=new Stack<Integer>();// Stack<String> creation
		s.push(10);// adding elements upto 10
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		s.push(80);
		s.push(90);
		s.push(100);
		//System.out.println(s);// this is if we directly want to print
		for(Integer temp:s) {// loop for iterating the stack values
			System.out.println(temp);// printing values
		}
		s.pop();// remove elements from stack
		s.pop();
		s.pop();
		s.pop();
		System.out.println("after poping 4times "+s);// after pop displaying stack 
	}

}
/*Output:-
 * 10
20
30
40
50
60
70
80
90
100
after poping 4times [10, 20, 30, 40, 50, 60]

 * */