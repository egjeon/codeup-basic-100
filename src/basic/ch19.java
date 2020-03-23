package basic;

import java.util.Scanner;

public class ch19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		
		int a = Integer.parseInt(date.split("\\.")[0]);
		int b = Integer.parseInt(date.split("\\.")[1]);
		int c = Integer.parseInt(date.split("\\.")[2]); 
		
		String a1,b1,c1 = "";
		
		if(a < 1000 && a > 100) {
			a1 = "0"+a;
		}else if(a < 100 && a > 10) {
			a1 = "00"+a;
		}else if(a < 10 && a > 1) {
			a1 = "000" + a;
		}else {
			a1 = ""+a;
		}
		if(b < 10) {
			b1 = "0"+b;
		}else {
			b1 = ""+b;
		}
		if(c < 10) {
			c1 = "0"+c;
		}else {
			c1 = ""+c;
		}
		System.out.print(a1 +"." + b1 +"." + c1);
		sc.close();
	}

}
