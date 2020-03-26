package basic;

import java.util.Scanner;

public class ch64 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = (a < b && a < c) ? a : (b < c) ? b : c; 
		System.out.println(min);
		sc.close();
	}
}
