package basic;

import java.util.Scanner;

public class FindMaxNumber {

	public static void main(String[] args) {
		int max =0;
		
		Scanner scan = new Scanner(System.in);
		
		int counter = scan.nextInt();
		int [] num = new int[counter];
		
		for(int i = 0; i < counter; i++) {
			num[i] = scan.nextInt();			
			if(i == 0)
				max = num[i]; 
			if(num[i] >= max) {
				max = num[i];
			}
		}
		
		System.out.println("MAX : " + max);
		scan.close();

	}

}
