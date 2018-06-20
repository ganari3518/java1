package basic;

import java.util.Scanner;

public class IpnutInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.print("number : ");

		int num = scan.nextInt();

		System.out.println("input number : " + num);

		scan.close();
	}

}
