package StringLab;

import java.util.Scanner;

public class CheckStringEquality {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String: ");
		String s2 = sc.nextLine();
		
		boolean s = s1.equals(s2);
		
		if( s == false) {
			System.out.println("Strings are not equal.");
		}
		
		else {
			System.out.println("Strings are equal.");
		}
	sc.close();
	}

}
