package StringLab;

import java.util.*;

/*Q 3 Write a Java program to compare two strings lexicographically.
Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions. 
public class CompareLexographically {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		int comp = s1.compareTo(s2);
		
		if(comp < 0){
			System.out.println(s1 + " is less than " + s2);
		}
		
		else if(comp == 0){
			System.out.println(s1 + " is equal to " + s2);
		}
		
		else{
			System.out.println(s1 + " is greater than " + s2);
		}
		sc.close();
	}
}
*/

//Q 4. Write a Java program to compare two strings lexicographically, ignoring case differences.
public class CompareLexographically {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String: ");
		String s2 = sc.nextLine();
		
		int comp = s1.compareToIgnoreCase(s2);
		
		if(comp < 0){
			System.out.println(s1 + " is less than " + s2);
		}
		
		else if(comp == 0){
			System.out.println(s1 + " is equal to " + s2);
		}
		
		else{
			System.out.println(s1 + " is greater than " + s2);
		}
		sc.close();
	}
}
