package basic;

import java.util.Scanner;

public class ch25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		String [] arr = String.valueOf(input).split("");
		String temp = "";
		for(int i = 0; i < arr.length; i++) {
			for(int j=i; j < arr.length-1; j++) {
					temp += "0";
			
			}
		if(!arr[i].equals("0")) {
			arr[i] += temp;
			}	
			temp = "";
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("0"))
			System.out.println("[" + arr[i] +"]");
		}
		sc.close();
	}
}
