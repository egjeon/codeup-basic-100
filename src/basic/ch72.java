package basic;

import java.util.Scanner;

public class ch72 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		int i = 0;
		while(i < n) {
			int temp = sc.nextInt();
			arr[i] = temp;
			i++;
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
		sc.close();
	}	
}
