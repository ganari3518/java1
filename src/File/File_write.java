package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_write {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		System.out.print("파일 : ");
		String Filename = scan.next();
		if(!Filename.contains(".txt")) {
			Filename += ".txt";
		}
		Scanner Filescan = new Scanner(Filename);
		int n = 0;
		while(Filescan.hasNext()) {
			n++;
			break;
		}
		Boolean tf = null;			
		if(n != 0) {
			System.out.print("덮어쓰시겠습니까?");
			String YS = scan.next();
			
			if(YS.equals("Y") || YS.equals("y"))
				tf = true;//덮어쓰기
			else
				tf = false;//새로 쓰기
		}
		System.out.print("들어갈 내용 : ");
		String content = scan.next();

		
		File file = new File(Filename);
		FileWriter fw = new FileWriter (file,tf);

		fw.write(content);
        fw.flush();
        
        System.out.println("쓰기 완료");
    }

}
