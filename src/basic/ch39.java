package basic;

import java.util.Scanner;

public class ch39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		if(n > 0) {
			System.out.println("-" + n);
		}else if(n < 0) {
			String temp = ""+n;
			System.out.println(temp.replace("-", ""));
		}else if(n == 0){
			System.out.println(n);
		}
		sc.close();
	}
}
