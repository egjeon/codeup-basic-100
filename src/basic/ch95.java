package basic;

import java.util.Scanner;

public class ch95 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr= new int[n];
		
		for(int i = 0; i < n; i++) {
			int t = sc.nextInt();
			arr[i] = t;
		}
		
		
		for(int i = n-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
