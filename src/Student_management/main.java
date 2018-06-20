package Student_management;

import java.util.Scanner;

public class main {
	static Grade [] stulist= new Grade[100];
	static int n = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("menu : add, print, del, exit");
		while(true) {
			System.out.print("$ ");
			String command = scan.next();
			if(command.equals("add")) {
				Grade stu = new Grade();
				System.out.print("이름 : ");
				stu.stuinfo.name = scan.next();

				System.out.print("나이 : ");
				stu.stuinfo.age = scan.nextInt();

				System.out.print("학년 : ");
				stu.stugrade = scan.nextInt();

				System.out.print("반 : ");
				stu.stuclass = scan.nextInt(); 

				stulist[n] = stu;
				n++;				
			}
			else if(command.equals("print")) {
				String name = scan.next();
				int index = -1;
				for(int i = 0 ; i < n ; i++) {
					if(stulist[i].stuinfo.name.equals(name)) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("입력한 학생이 없음");					
				}
				else {
					System.out.println("이름 : "+stulist[index].stuinfo.name);
					System.out.println("나이 : "+stulist[index].stuinfo.age);
					System.out.println("학년 : "+stulist[index].stugrade);
					System.out.println("반 : "+stulist[index].stuclass);
				}
			}
			else if(command.equals("del")) {
				String name = scan.next();
				int index = -1;
				for(int i = 0 ; i < n ; i++) {
					if(stulist[i].stuinfo.name.equals(name)) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("입력한 학생이 없음");					
				}
				else {
					stulist[index] = null;
					n--;
					System.out.println(name + "삭제 완료");
				}
			}
			else if(command.equals("exit")) {
				System.out.println("----------END----------");
				break;
			}
			else {
				String str = scan.nextLine();
			}



		}

	}

}
