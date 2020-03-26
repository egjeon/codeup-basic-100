package basic;

import java.util.Scanner;

public class ch54 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = n == 0 ? 1 : 0;
		System.out.println(result);
		sc.close();
	}
}
