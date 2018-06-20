package String;

import java.util.Scanner;

public class String_equals {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		scan.close();
		
		if(a.equals(b)) {
			System.out.println(a + " == " + b);
		}
		else {
			System.out.println(a + " != " + b);
		}
		
	}

}
