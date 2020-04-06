package basic;

import java.util.Scanner;

public class ch98 {
	public static void main(String[] args)  {
		int [][] arr = new int [19][19];
		Scanner sc = new Scanner(System.in);
		int n,x,y;
		for(int i=0; i < arr.length; i++) {
			String input = sc.nextLine();
			String [] arrTemp = input.split(" ");
			for(int j=0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(arrTemp[j]);
			}
		}	
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			for(int j=0; j<arr[i].length; j++) {
				if(arr[x-1][j]==0)
					arr[x-1][j] = 1;
				else 
					arr[x-1][j] = 0;
			}
			for(int j=0; j<arr[i].length; j++) {
				if(arr[j][y-1]==0) 
					arr[j][y-1]=1;
				else 
					arr[j][y-1]=0;
			}
		}
	
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
} 