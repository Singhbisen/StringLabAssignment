package StringLab;

import java.util.*;
//Q 1 Write a Java program to get the character at the given index within the String
public class FindByIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("String is: " + s);
		System.out.println("Enter the index number to find: ");
		int i = sc.nextInt();
		char a = s.charAt(i);
		System.out.println(a);
sc.close();
	}

}
