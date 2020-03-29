package basic;

import java.util.Scanner;

public class ch80 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tot = 0;
		int i = 1;
		int count = 0;
		
		while(tot < n) {
			tot += i;
			i++;
			count++;
		}
		System.out.println(count);
		sc.close();
		
	}
}
