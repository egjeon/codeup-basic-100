package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ch73 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		while(true) {
			int n = sc.nextInt();
			if(n != 0) {
				list.add(n);
				
			}else {
				break;
			}
		}
		sc.close();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
