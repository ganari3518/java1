package Method;

public class MethodDecimal {

	public static void main(String[] args) {
		for(int i = 1; i<1000 ; i++ ) {
			if(FindDecimal(i)) {
				System.out.println(i + " is Decimal");
			}
		}

	}
	static boolean FindDecimal(int num) {
		if(num < 2) {
			return false;
		}
		for(int i=2;i*i <= num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}

}
