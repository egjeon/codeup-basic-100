package basic;

import java.util.Scanner;

public class ch26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String m = input.split(":")[1];
		if(m.equals("0")) {
			System.out.println("??");
			m += "0";
		}else if(m.equals("00")) {
			m = "0";
		}
		System.out.println(m);
		sc.close();
	}
}
