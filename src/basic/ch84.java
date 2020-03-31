package basic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ch84 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int r,g,b;
		r = sc.nextInt();
		g = sc.nextInt();
		b = sc.nextInt();
		int count = r*g*b;
		for(int i=0; i<r; i++) 
			for(int j=0; j<g; j++) 
				for(int k=0; k<b; k++) {
					String temp =i + " "+ j + " " + k ; 
					bw.write(temp + "\n");
				}
		bw.write(String.valueOf(count));
		bw.close();
	}
}
