package basic;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		int [] arr = new int[cnt];
		int temp = 0;
		for(int i=0; i<cnt;i++) {
			arr[i]= scan.nextInt();
		}
		scan.close();
		
		for(int i=cnt-1 ; i>0; i--) {
			for(int j = 0; j<i;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<cnt;i++) {
			System.out.print(arr[i]+"   ");
		}
	}

}
