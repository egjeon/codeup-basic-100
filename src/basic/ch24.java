package basic;

import java.util.Scanner;

public class ch24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		String [] arr = word.split("");
		
		for(int i = 0; i < word.length(); i++) {
			System.out.println("\'" + arr[i] + "\'");
		}
		sc.close();
	}
}
