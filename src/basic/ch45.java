package basic;

import java.util.Scanner;

/*첫 줄에 합
둘째 줄에 차,
셋째 줄에 곱,
넷째 줄에 몫,
다섯째 줄에 나머지,
여섯째 줄에 나눈 값을 순서대로 출력한다.
(실수, 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력)*/
public class ch45 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		float a1 = a;
		float b1 = b;
		float result = a1/b1;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.printf(String.format("%.2f",result ));
		sc.close();
	}
}
