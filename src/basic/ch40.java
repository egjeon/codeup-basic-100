package basic;

import java.util.Scanner;

public class ch40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] lowerArr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "m", "o", "p", "q", "s", "t",
				"u", "v", "w", "x", "y", "z" };
		String result = "";
		try {
			int a = Integer.parseInt(input);
			System.out.println(a + 1);
		} catch (Exception e) {
			// TODO: handle exception
			for (int i = 0; i < lowerArr.length; i++) {
				if(input.charAt(0) >= 97) {
					if (input.equals(lowerArr[i])) {
						result = lowerArr[i + 1];
						break;
					}
				}else {
					if (input.equals(lowerArr[i].toUpperCase())) {
						result = lowerArr[i + 1].toUpperCase();
						break;
					}
				}
				
			}
		}
		System.out.println(result);
		sc.close();
	}
}
