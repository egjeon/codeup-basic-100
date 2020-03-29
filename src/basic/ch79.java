package basic;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ch79 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
				
		while (true) {
			String input = sc.next();
			list.add(input);
			if(input.equals("q")) {
				break;
			}
			
			
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		sc.close();
	}
}
