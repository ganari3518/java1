package Method;

import java.util.Scanner;

public class MethodPower {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result = power(num1,num2);
		
		System.out.println("Result : "+ result);

	}
	
	static int power(int a, int b) {
		int result = 1;
		for(int i=0;i<b;i++) {
			result *= a;
		}
		return result;
	}
}
