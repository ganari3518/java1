package basic;

public class Print {
	
	static int num;
	
	public static void main(String[] args) {
		
		int anothernum = 5;
		num = 7; 
		
		System.out.println(num + anothernum);
		System.out.println("num" + num);
		System.out.println("anothernum : " + anothernum);
		
		System.out.println("sum : " + num + anothernum);
		System.out.println("sum : " + (num + anothernum));

	}
}
