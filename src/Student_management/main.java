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
				System.out.print("�̸� : ");
				stu.stuinfo.name = scan.next();

				System.out.print("���� : ");
				stu.stuinfo.age = scan.nextInt();

				System.out.print("�г� : ");
				stu.stugrade = scan.nextInt();

				System.out.print("�� : ");
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
					System.out.println("�Է��� �л��� ����");					
				}
				else {
					System.out.println("�̸� : "+stulist[index].stuinfo.name);
					System.out.println("���� : "+stulist[index].stuinfo.age);
					System.out.println("�г� : "+stulist[index].stugrade);
					System.out.println("�� : "+stulist[index].stuclass);
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
					System.out.println("�Է��� �л��� ����");					
				}
				else {
					stulist[index] = null;
					n--;
					System.out.println(name + "���� �Ϸ�");
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
