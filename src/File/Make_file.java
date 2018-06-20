package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Make_file {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일 이름 : ");
		String Filename = scan.next();
		
		if(!Filename.matches(".txt")) {
			Filename += ".txt";
		}
		scan.close();
		
		File file = new File(Filename) ;
		
        FileWriter fw = new FileWriter(file, true) ;
        
        fw.close();
	}

}
