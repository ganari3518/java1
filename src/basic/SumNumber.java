package basic;

import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		
		int [] number = new int[cnt];
		int sum = 0;
		
		for(int i = 0; i < cnt; i++) {
			number[i] = scan.nextInt();
			sum += number[i];
		}
		
		System.out.println("SUM : " + sum);
		
		scan.close();

	}

}
