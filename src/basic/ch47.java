package basic;

import java.util.Scanner;

public class ch47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a,b,c;
		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		double result = a+b+c;
		System.out.println(a+b+c);
		System.out.printf(String.format("%.1f", result/3));
		sc.close();
	}
}
