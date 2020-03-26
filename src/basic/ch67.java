package basic;

import java.util.Scanner;

public class ch67 {
	public static String getEvenOrOdd(int value) {
		String result = value % 2 == 0 ? "even" : "odd";
		return result;
	}
	
	public static String getMinusPlus(int value) {
		String temp = ""+value; 
		String [] arr = temp.split("");
		String result = "";
		if(arr[0].equals("-")) {
			result = "minus";
		}else {
			result = "plus";
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getMinusPlus(n));
		System.out.print(getEvenOrOdd(n));
		sc.close();
	}
}
