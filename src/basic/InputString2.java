package basic;

import java.util.Scanner;

public class InputString2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("what is your name: ");
		
		String str = scan.next();
		
		System.out.println("your name is " + str);
		scan.close();
	}

}
