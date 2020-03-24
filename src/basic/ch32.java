package basic;

import java.util.Scanner;

public class ch32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Integer.toHexString(n));
		sc.close();
	}
}
