package basic;

import java.util.Scanner;

public class ch87 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(sum < n) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		sc.close();
	}
}
