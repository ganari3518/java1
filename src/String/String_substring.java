package String;

import java.util.Scanner;

public class String_substring {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		String str = scan.next();

		scan.close();
		
		System.out.println("a문자열의 4에서 6전까지의 단어 가져오기");
		System.out.println(str.substring(4,6));
	}

}
