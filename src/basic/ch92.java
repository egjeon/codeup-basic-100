package basic;

import java.util.Scanner;

public class ch92 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt(); // 시작값
		long m = sc.nextInt(); // 곱할값
		long d = sc.nextInt(); // 더할값
		long n = sc.nextInt(); // 몇번째
		
		
		 //1 -2 1 8
		 //시작값 1 , 곱할값 -2 , 더할값 1 , 8번째
		long temp1 = 0;
		long result = a;
		for(int i = 0; i < n-1; i++) {
			temp1 = (result*m)+d;
			result = temp1; 
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
