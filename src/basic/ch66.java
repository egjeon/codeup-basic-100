package basic;

import java.util.Scanner;

public class ch66 {
	
	public static String getEvenOrOdd(int value) {
		String result = value % 2 == 0 ? "even" : "odd";
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println(getEvenOrOdd(a));
		System.out.println(getEvenOrOdd(b));
		System.out.print(getEvenOrOdd(c));
		sc.close();
	}
}
