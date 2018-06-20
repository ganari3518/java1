package Method;

import java.util.Scanner;

public class MethodBubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		int [] arr = new int[cnt];
		int temp = 0;
		for(int i=0; i<cnt;i++) {
			arr[i]= scan.nextInt();
		}
		scan.close();
		
		bubblesort(cnt , arr);
		
		
		for(int i=0; i<cnt;i++) {
			System.out.print(arr[i]+"   ");
		}
	}
	static void bubblesort(int cnt, int [] data) {
		for(int i=cnt-1 ; i>0; i--) {
			for(int j = 0; j<i;j++) {
				if(data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
	}

}
