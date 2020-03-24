package basic;

import java.util.Scanner;

public class ch27 {
	public static String changeDot(String value) {
		String result = "";
		String [] arrTemp = value.split("\\.");
		 result = arrTemp[2] + "-" + arrTemp[1] + "-" + arrTemp[0];
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(changeDot(input));
		sc.close();
	}
}
