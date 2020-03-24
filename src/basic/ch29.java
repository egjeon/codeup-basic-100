package basic;

import java.util.Scanner;

public class ch29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		String result = String.format("%.11f", input);
		System.out.print(result);
		sc.close();
	}
}
