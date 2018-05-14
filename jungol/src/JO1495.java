import java.util.Scanner;

public class JO1495 {

	public static void main(String[] args) {
		// 정사각형의 크기를 입력 받은 후 대각선으로 지그재그 형태인 다음과 같은 형태로 출력하는 프로그램을 작성하시오.

		// < 처리조건 > 
		// (1) 가장 왼쪽 위의 좌표부터 차례로 숫자를 대입시킨다. 
		// (2) 대각선을 기준으로 계속 지그재그 모양으로 채워져야 하며 숫자는 1씩 증가하는 형태로 채워나가야 한다.
		
		// 1  3  4  10 11
		// 2  5  9  12 19
		// 6  8  13 18 20
		// 7  14 17 21 24
		// 15 16 22 23 25
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		arr[0][0] = 1;
		int num = 2;
		int max = 1;
		
		// 왼쪽 위 삼각형
		for (int i = 1; i < n; i++) {
			
			for (int j = 0; j <= i; j++) {
				
				if (i % 2 == 1)
					arr[max - j][j] = num++;
				else
					arr[j][max - j] = num++;
			}
			
			max++;
			
		}
		
		// 오른쪽 아래 삼각형
		for (int i = 1; i < n; i++) {
			
			for (int j = n - 1; j >= i; j--) {
				
				if (i % 2 == 1)
					arr[j][max - j] = num++;
				else
					arr[max - j][j] = num++;
			}
			
			max++;
			
		}
			
		// 배열 출력
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
