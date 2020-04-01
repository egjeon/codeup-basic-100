package basic;

import java.util.Scanner;

public class ch91 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long r = sc.nextInt();
		long n = sc.nextInt();
		
		/*예를 들어
		2 6 18 54 162 486 ... 은
		2부터 시작해 이전에 만든 수에 3을 곱해 다음 수를 만든 수열이다.

		이러한 것을 수학에서는 앞뒤 수들의 비율이 같다고 하여
		등비(비율이 같다의 한문 말) 수열이라고 한다.
*/
		
	//	a = 2 ?
	 //   r = 3?
	  //  n = 7?
	    		long temp1 = r;
	    		for(int i = 0; i < n-1; i++) {
	    			temp1 = a*r;
	    			a = temp1;
	    		}
	    		
	    		System.out.print(temp1);
	    		sc.close();
	}
}
