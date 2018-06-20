package basic;

import java.util.Scanner;

public class InputSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cnt = scan.nextInt();
		int [] arr = new int[cnt];
		int num;
		int temp = 0;
		arr[0] =0;
		for(int i=0; i<cnt;i++) {
			num = scan.nextInt();
			for(int j=0;j<=i;j++) {
				if(num < arr[j]) {
					temp = arr[j];
					arr[j] = num;
					arr[j+1] = arr[j];
				}
				else
					arr[j] = num;
			}		
			System.out.println(i +":"+arr[i]);
		}
		for(int i=0; i<cnt;i++) {
			System.out.println(arr[i]+"    ");
		}
		scan.close();


	}

}
