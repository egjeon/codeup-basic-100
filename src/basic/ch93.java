package basic;

import java.util.Scanner;

public class ch93 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		int day = 1;
		

/*day는 날 수, a/b/c는 방문 주기이다.
...
day=1;
while(day%a!=0 || day%b!=0 || day%c!=0) day++; //이게 무슨 의미일까?
printf(＂%d＂, day);
...*/        
		while(day%a!=0 || day%b!=0 || day%c!=0) {
			day++;
		}
		System.out.println(day);
		sc.close();
	}
}
