package basic;

import java.util.Scanner;

public class ch100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int [10][10];
		boolean stopBoo = false;
		
		for(int i=0; i<arr.length; i++) {
			String input = sc.nextLine();
			String [] inputArr = input.split(" ");
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(inputArr[j]);
			}
		}
		int jumper = 0;
		for(int i=0; i < arr.length; i++) {
			if(stopBoo) {
				//System.out.println("먹이찾았다.");
				break;
			}
			
			for(int j=jumper; j<arr[i].length; j++) {
				if(arr[i][j] == 0) {
					//System.out.println("0번을만났다. 9번으로체인지");
					arr[i][j] = 9;
				}
				if(arr[i][j] == 1) {
					//System.out.println("1번 벽을만났다! j값을 jumper에 대입 !!  ");
					if(j>1) {
						jumper = j-1;
					}else {
						jumper = j+1;
					}
					break;
				}
				if(arr[i][j] == 2) {
					arr[i][j] = 9;
					stopBoo = true;
					break;
				}
			}
		}
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
