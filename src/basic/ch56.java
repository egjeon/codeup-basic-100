package basic;

import java.util.Scanner;

public class ch56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int result = n == 1 || b == 1 ? 1 : 0;
		System.out.println(result);
		sc.close();
	}
}
