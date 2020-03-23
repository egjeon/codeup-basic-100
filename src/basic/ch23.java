package basic;

import java.util.Scanner;

public class ch23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		String strInput = ""+input;
		String a,b;
		a = strInput.split("\\.")[0];
		b = strInput.split("\\.")[1];
		System.out.println(a);
		System.out.print(b);
		sc.close();
		
	}
}
