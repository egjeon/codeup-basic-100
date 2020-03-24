package basic;

import java.math.BigInteger;
import java.util.Scanner;

public class ch38 {
	public static void main(String[] args) {
		BigInteger a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextBigInteger();
		b = sc.nextBigInteger();
		System.out.println(a.add(b));
		sc.close();
	}
}
