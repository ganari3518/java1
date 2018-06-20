package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner (new File( "indexs.txt" ));
			
			String [] name = new String[1000];
			String [] number = new String[1000];
			
			int n=0;
			
			while(scan.hasNext()) {
				name[n] = scan.next();
				number[n] = scan.next();
				n++;
			}
			
			for(int i=0;i<n;i++) {
				System.out.println(name[i]+" : "+number[i]);	
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
		}		

	}

}
