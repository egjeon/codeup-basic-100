package basic;

import java.util.Scanner;

public class ch99 {
	public static void main(String[] args) {
		//5 5
		//3
		//2 0 1 1
		//3 1 2 3
		//4 1 2 5
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] strArr = input.split(" ");
		int [][] arr = new int[Integer.parseInt(strArr[0])][Integer.parseInt(strArr[1])];
		int n = sc.nextInt();sc.nextLine();
		
		for(int i=0; i<n; i++) {
			int length,d,x,y;

			String stickInfo = sc.nextLine();
			String [] stickArr = stickInfo.split(" ");
			
			length = Integer.parseInt(stickArr[0]);
			d = Integer.parseInt(stickArr[1]);
			x = Integer.parseInt(stickArr[3])-1;
			y = Integer.parseInt(stickArr[2])-1;
			
		    if(d == 0) {
                for(int j = 0; j < length; j++) {
                	arr[y][x+j] = 1;
                }
            }
            else {
                for(int k = 0; k < length; k++) {
                	arr[y+k][x] = 1;
                }
            }
		
		}
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
