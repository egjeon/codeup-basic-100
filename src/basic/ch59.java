package basic;

import java.util.Scanner;

public class ch59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = ~n;
		System.out.println(result);
		sc.close();
	}
}
