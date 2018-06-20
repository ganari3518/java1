package Method;

import java.util.Scanner;

public class Call_By_Value {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		print(a,b);
		System.out.println("main Method");
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		scan.close();
	}
	
	static void print(int a,int b) {
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("print Method");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}
