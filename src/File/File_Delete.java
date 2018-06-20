package File;

import java.io.File;
import java.util.Scanner;

public class File_Delete {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("삭제할 파일 : ");
		String Filename = scan.next();
		if(!Filename.contains(".txt")) {
			Filename += ".txt";
		}
		
		File file = new File(Filename);
		
		file.delete();
		System.out.println("삭제 완료");
	}

}
