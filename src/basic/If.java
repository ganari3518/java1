package basic;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
				
		if(a == b) {
			System.out.println("a,b same");
		}
		else {
			System.out.println("a,b not same");
		}
		
		
		String str = "Hello";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input srting : ");
		
		String instr = input.next();
		
		if(str.equals(instr)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		
		input.close();
		

	}

}
