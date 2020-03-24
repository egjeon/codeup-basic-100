package basic;

import java.util.Scanner;

public class ch35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int result = Integer.valueOf(n, 16);
		System.out.println(Integer.toOctalString(result));
		sc.close();
	}
}
