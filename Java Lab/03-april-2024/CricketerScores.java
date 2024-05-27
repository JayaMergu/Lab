/*write a program in Java to create a Map Interface where we can store the cricketer name in it
	along with his scores and search for the batsman name and display his score.
	*/
package com.collectionframeworkexample;// storing program in package
import java.util.HashMap;// importing requires classes
import java.util.Map;
import java.util.Scanner;
public class CricketerScores {// to store the scores of cricketers

	public static void main(String[] args) {// main method
			Map<String, Integer> scores = new HashMap<>();// Populate the Map with sample data
	        scores.put("Sachin T", 900);
	        scores.put("Virat K", 100);
	        scores.put("Rohit S", 90);
	        scores.put("Mahindrasingh D", 80);
	       Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the batsman name: ");
	        String batsmanName = sc.nextLine();// Check if the batsman name
	        if (scores.containsKey(batsmanName)) {// adding condition
	        	int score = scores.get(batsmanName);
	            System.out.println("Score of " + batsmanName + ": " + score);
	        } else {// If the batsman name doesn't exist, display a message
	            System.out.println("Batsman not found!");
	        } 

		}
	}

/*
OUTPUT :
	
	Enter the batsman name: MS Dhoni
	Score of MS Dhoni: 70
	
	Enter the batsman name: Hardik Pandya
	Batsman not found!
	*/

