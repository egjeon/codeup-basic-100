package basic;

import java.util.Scanner;

public class ch96 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j =i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; 
				}
			}
			
		}
		System.out.print(arr[0]);
	
	}
}
