package String;

import java.util.Scanner;

public class String_isLetter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		scan.close();
		
		for(int i=0;i<str.length() ; i++) {
			if(Character.isLetter(str.charAt(i))) {
				System.out.print(str.charAt(i));	
			}		
		}
	}

}
