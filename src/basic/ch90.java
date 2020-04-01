package basic;

import java.util.Scanner;

public class ch90 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //시작값
		int d = sc.nextInt(); //등차값
		int n = sc.nextInt(); //몇번째수?
		
		System.out.print(a+d*(n-1));
		sc.close();
	}
}
