package basic;

import java.util.Scanner;

public class ch70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getNowSeasons(n));
		sc.close();
	}

	public static String getNowSeasons(int n) {
		String seasons = "default";

		switch (n) {
		case 12:
			seasons = "winter";
		case 1:
			seasons = "winter";
		case 2:
			seasons = "winter";
		case 1212 : seasons = "winter";
			break;
		case 3:
			seasons = "spring";
		case 4:
			seasons = "spring";
		case 5:
			seasons = "spring";
		case 345:
			seasons = "spring";
			break;
		case 6:
			seasons = "summer";
		case 7:
			seasons = "summer";
		case 8:
			seasons = "summer";
		case 678 : 
			seasons = "summer";
			break;
		case 9:
			seasons = "fall";
		case 10:
			seasons = "fall";
		case 11:
			seasons = "fall";
		case 91011 : 
			seasons = "fall";
			break;
		}
		
		return seasons;
	}
}
