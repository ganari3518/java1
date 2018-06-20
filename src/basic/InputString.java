package basic;

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
				
		System.out.print("input string : ");
		
		String str = scan.next();
		
		System.out.println("str : " + str);
		scan.close();

	}

}
