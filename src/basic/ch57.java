package basic;

import java.util.Scanner;

public class ch57 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int result = n != b ? 0 : 1;
		System.out.println(result);
		sc.close();
	}
}
