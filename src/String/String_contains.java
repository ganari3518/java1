package String;

import java.util.Scanner;

public class String_contains {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String str = scan.next();
		scan.close();
		
		if(str.contains("A"))
			System.out.println("A가 있음");
		else
			System.out.println("A가 없음");
	}
}
