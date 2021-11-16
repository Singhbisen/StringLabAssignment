package StringLab;

import java.util.Scanner;

//Q 2 Write a Java program to concatenate a given string to the end of another string

public class ConcatenateStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	// Method 1: Concatenate Using (+) operator.
		
		System.out.println("Enter first string: ");
		String s1 = sc.next();
		System.out.println("Enter second string: ");
		String s2 = sc.next();
		String s3 = s1 + s2;
		System.out.println(s3);
		
		
		// Method 2: Concatenate Using (.concat()) method.
		System.out.println("Enter first string: ");
		String s4 = sc.next();
		System.out.println("Enter second string: ");
		String s5 = sc.next();
		String s6 = s4.concat(s5);
		System.out.println(s6);
		
	sc.close();
	}

}
