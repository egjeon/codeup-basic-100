package basic;

import java.util.Scanner;

public class ch89 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int s = 0;
		int b = a;
		int c = 0;
		for(int i = a; i<=n; i++) {
			s = b;
			b = s+d;
			c = b;
		}
		System.out.println(c);
		sc.close();
	}
}
