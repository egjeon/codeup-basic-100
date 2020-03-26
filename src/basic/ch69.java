package basic;

import java.util.Scanner;

public class ch69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char n = sc.next().charAt(0);
		System.out.print(getSentence(n));
		sc.close();
	}
	public static String getSentence(char value) {
		String result = "";
		switch (value) {
		
		case 'A': result = "best!!!";
			break;
		case 'B': result = "good!!";
		break;
		case 'C': result = "run!";
		break;
		
		case 'D': result = "slowly~";
		break;
		
		default: result = "what?";
			break;
		}
		return result;
	}
}
