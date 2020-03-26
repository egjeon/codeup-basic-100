package basic;

import java.util.Scanner;

public class ch41 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a/b);
		sc.close();
	}
}
