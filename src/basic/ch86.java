package basic;

import java.util.Scanner;

public class ch86 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long w = sc.nextLong();
		long h = sc.nextLong();
		long b = sc.nextLong();
		
		double result = (w*h*b);
		
		System.out.printf("%.2f MB",result/8388608);
		
		
	}
}
