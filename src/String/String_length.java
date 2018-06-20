package String;

import java.util.Scanner;

public class String_length {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		scan.close();

		System.out.println("str단어의 길이 : " + str.length());
	}

}
