/*Write a Java program that calculates the sum of all even numbers present in an
ArrayList of integers.*/
package com.collectionframeworkexample;// saving program in package

import java.util.ArrayList;// importing required classes

public class ArrayListExample1 {// to perform summation of elements from ArrayList

	public static void main(String[] args) {// main method
		ArrayList<Integer> a=new ArrayList<Integer>();// creating ArrayList
		ArrayList<Integer> b=new ArrayList<Integer>();
		int sum=0,sum1=0;// attributes to sum the values
		for(int i=1;i<=10;i++) {// for loop to add values
			a.add(i);// adding using add method
		}
		System.out.println("Elements in an ArrayList of a are:"+a);
		for(Integer temp:a) {// enhanced for loop to do sum
			if(temp%2==0) {// condition
				sum+=temp;// summation
			}
		}
		System.out.println("sum of even elements in ArrayList of a is: "+sum);// printing sum
		b.add(2);// adding values
		b.add(5);
		b.add(8);
		b.add(10);
		b.add(15);
		System.out.println("Elements in an ArrayList of b are:"+b);
		for(Integer temp:b) {// enhanced for loop to do sum
			if(temp%2==0) {// for loop to add values
				sum1+=temp;// summation
			}
		}
		System.out.println("sum of even elements in ArrayList of b is: "+sum1);// printing sum
		

	}

}
/*Output:-
 * Elements in an ArrayList of a are:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
sum of even elements in ArrayList of a is: 30
Elements in an ArrayList of b are:[2, 5, 8, 10, 15]
sum of even elements in ArrayList of b is: 20

 * */
