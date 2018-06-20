package String;

import java.util.Scanner;

public class String_compareTo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		scan.close();
		
		if (a.compareTo(b)<0) 
			System.out.println(a + " < " + b);
		
		else if (a.compareTo(b)==0)
			System.out.println(a + " == " + b);
		
		else
			System.out.println(a + " > " + b);

	}

}
