package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Find_File_word {
	private static final String FileWrite = null;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		
		System.out.print("$ ");
		String menu = scan.next();
		String Filename;
		String word;
		while(!menu.equals("exit")) {
			if(menu.equals("read")) {
				Filename = scan.next();
				if(Filename.equals("help"))
					System.out.println("read [File Name] [Find word]");
				else {
					read(Filename);
				}
			}
			else if(menu.equals("make")) {
				Filename = scan.next();
				if(Filename.equals("help"))
					System.out.println("make [File Name]");
				else 
					make(Filename);
			}
			else if(menu.equals("help")) {
				System.out.println("read [File Name]");
				System.out.println("make [File Name]");
				System.out.println("write [File Name]");
			}
			else {
				System.out.println("$ 잘못된 명령어 입니다.");
			}
			
			System.out.print("$ ");
			menu = scan.next();
			
		}
		scan.close();
		System.out.println("End");
		
	}
	static void read(String Filename) throws Exception {
		Scanner Filescan = new Scanner(new File(Filename));
		String [] filecontents = new String[10000];
		
		int n=0;
		
		while(Filescan.hasNext()) {
			filecontents[n] = Filescan.next();	
			n++;
		}
			
		for(int i=0;i<n;i++) {
			System.out.println(filecontents[i]);
		}
		
		Filescan.close();		
	}
	static void make(String Filename) throws Exception {
		File file = new File (Filename);
		FileWriter con = null ;
		if(!file.isFile()) {
			con = new FileWriter(Filename,true);			
		}
		System.out.println("contents");
		
		String contents = scan.next();
		
		con.write(contents);
		con.flush();
		
		System.out.println("입력 완료");
		
	}

}
