package basic;

import java.util.Scanner;

public class ch76 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		
		String [] arr = {"a","b","c","d","e","f","g","h","i",
				"j","k","l","m","n","o"
				,"p","q","r","s","t","u","v","w","x","y","z"	
		};
		
		
		for(int i = 0; i < arr.length; i++) {
			if(input.equals(arr[i])) {
				System.out.print(arr[i] + " ");
				break;
			}else {
				System.out.print(arr[i]+ " ");
			}
		}
		sc.close();
		
				
	}
}
