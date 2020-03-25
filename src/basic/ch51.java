package basic;

import java.util.Scanner;

public class ch51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		int result = a == b ? 1 : 0;
		System.out.println(result);
		sc.close();
	}
}
