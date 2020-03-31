package basic;

import java.util.Scanner;

public class ch85 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 44100hz 16bit 2chanel 10sec
		  //h      b        c       s
		 //(h * b * c * s) / 8bit = 결과값
		
		// 결과값 / 1024byte ~~~~ sound wave 도출
		
		long h = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long s = sc.nextInt();
		double sum = h*b*c*s; 
		
		//44100 16 2 10
		
		System.out.printf("%.1f MB",sum/8388608);
		//String nBit = Integer.toBinaryString(b);
		sc.close();
		
	}
}
