package basic;

import java.util.Scanner;

public class ch34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int result = Integer.valueOf(input, 8);
		System.out.println(result);
		sc.close();
	}
}
