package basic;

import java.util.Scanner;

public class ch20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ipin = sc.next();
		String a  = ipin.split("-")[0];
		String b = ipin.split("-")[1];
		System.out.print(a+b);
		sc.close();
	}

}
