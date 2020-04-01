package basic;

import java.util.Scanner;

public class ch94 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [23]; //1~24;   0~23
		
		
		
		for(int i = 1; i <= n; i++) {
			int t = sc.nextInt();
			arr[t-1] +=1;
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

/*문제 해결을 위한 참고 코드

int n, i, t;
int a[24]={};
scanf("%d", &n); //개수 입력받기
for(i=1; i<=n; i++) //개수만큼 입력받기
{
  scanf("%d", &t); //읽어서
  a[t]=a[t]+1; //들어있던 값에 1만큼 더해 다시 저장. a[t]+=1 과 같다.
}
for(i=1; i<=23; i++)
{
  printf("%d ", a[i]); //1~23 번 배열에 저장되어있는 값 출력하기
}*/


	}
}	
