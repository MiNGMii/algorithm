import java.util.Scanner;

public class JO1856 {

	public static void main(String[] args) {
		// 사각형의 높이 n과 너비 m을 입력받은 후 사각형 내부에 지그재그 형태로 1부터 n*m번까지 
		// 숫자가 차례대로 출력되는 프로그램을 작성하시오. 
		
		// < 처리조건 > 
		// 숫자의 진행 순서는 처음에 왼쪽에서 오른쪽으로 너비 m만큼 진행 한 후 방향을 바꾸어서 이를 반복한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		
		System.out.print("m: ");
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		int num = 0;
		
		// 배열에 입력받기
		for (int i = 0; i < n; i++) {
			
			if (i % 2 == 0) {
				
				for (int j = 0; j < m; j++) {
					num++;
					arr[i][j] = num;
				}
				
			} else {
				
				for (int j = m - 1; j >= 0; j--) {
					num++;
					arr[i][j] = num;
				}
			}
		}
		
		// 배열 출력
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
		}

	}

}
