package Polynomial;

import java.util.Scanner;

public class Main_code {

	static Polynomial [] polys = new Polynomial[100];
	static int n = 0;	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("$ ");
			String command = scan.next();

			if(command.equals("create")) {
				char name = scan.next().charAt(0);
				Polynomial p = new Polynomial();
				p.name = name;
				p.nTerms = 0;
				polys[n] = p;
				n++;
			}
			else if(command.equals("add")) {
				char name = scan.next().charAt(0);
				int index = find(name);
				if(index == -1)
					System.out.println("항이 없음");
				else {
					int c= scan.nextInt();
					int e= scan.nextInt();
					addTerm(polys[index], c,e);
				}
			}

			else if(command.equals("calc")) {
				char name = scan.next().charAt(0);
				int index = find(name);
				if(index == -1)
					System.out.println("항이 없음");
				else {
					int x = scan.nextInt();
					int result = calcPolynomial(polys[index],x);
					System.out.println(result);
				}
			}
			else if(command.equals("print")) {
				char name = scan.next().charAt(0);
				int index = find(name);
				if(index == -1)
					System.out.println("항이 없음");
				else {
					printPolysnomial(polys[index]);
				}
			}
			else if(command.equals("exit")) {
				System.out.println("-----------end-----------");
				break;
			}
			else {
				String str = scan.nextLine();
			}
		}
	}

	private static int calcPolynomial(Polynomial p, int x) {
		int result = 0;
		for(int i=0;i<p.nTerms;i++) {
			result += calcTerm(p.terms[i],x);
		}
		return result;
	}

	private static int calcTerm(Term term, int x) {
		return (int) (term.coef * Math.pow(x,term.expo));
	}

	private static void printPolysnomial(Polynomial p) {
		for(int i=0;i<p.nTerms;i++) {
			printTerm(p.terms[i],i);
		}
		System.out.println();
	}

	private static void printTerm(Term term,int i) {
		if(i == 0) {
			System.out.print(term.coef + "x^" + term.expo);
		}
		else {
			if(term.coef > 0) {
				System.out.print("+");
			}
			else {
				System.out.print("-");
			}
			System.out.print(term.coef + "x^" + term.expo);
		}
	}

	private static void addTerm(Polynomial p, int c, int e) {
		int index = findTerm(p,e);
		if(index != -1) {
			p.terms[index].coef += c;
			if(p.terms[index].coef == 0) {
				p.nTerms--;
			}

		}
		else {
			int i = p.nTerms - 1;
			while(i >= 0 && p.terms[i].expo < e) {
				p.terms[i+1] = p.terms[i];
				i--;
			}
			p.terms[i+1] = new Term();
			p.terms[i+1].coef = c;
			p.terms[i+1].expo = e;
			p.nTerms++;
		}
	}

	private static int findTerm(Polynomial p, int e) {
		for(int i=0; i<p.nTerms; i++) {
			if(p.terms[i].expo == e) {
				return i;				
			}			
		}
		return -1;	
	}

	private static int find(char name) {
		for(int i=0;i<n;i++) {
			if(polys[i].name == name) {
				return i;			
			}
		}
		return -1;
	}


}
