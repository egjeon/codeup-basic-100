package basic;

import java.util.Scanner;

public class ch12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		System.out.print(String.format("%.6f",f));
		sc.close();
	}

}
