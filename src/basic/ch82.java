package basic;

import java.util.Scanner;

public class ch82 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int [] arr = {10,11,12,13,14,15};
		int temp = 0;
		switch (input) {
		case "A": temp = arr[0];
			break;
		case "B": temp = arr[1];
		break;
		case "C": temp = arr[2];
		break;
		case "D": temp = arr[3];
		break;
		case "E": temp = arr[4];
		break;
		case "F": temp = arr[5];
		break;
		
		default:
			break;
		}
		
		for(int i=temp; i<temp+1; i++) {
			for(int j=1; j < 16; j++ ) {
				System.out.println(Integer.toHexString(temp).toUpperCase() + "*" + Integer.toHexString(j).toUpperCase()  + "="+ Integer.toHexString(temp*j).toUpperCase());
			}
		}
		sc.close();
		
	}
}
