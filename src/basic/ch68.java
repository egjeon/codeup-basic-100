package basic;

import java.util.Scanner;

public class ch68 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 System.out.println(getGrade(n));
		sc.close();
	}

	private static String getGrade(int n) {
		String grade = "";
		if(n >= 90 && n <= 100) {
			grade = "A";
		}else if(n >= 70 && n <= 89) {
			grade = "B";
		}else if(n >= 40 && n <= 69) {
			grade = "C";
		}else {
			grade = "D";
		}
		return grade;
	}
}
