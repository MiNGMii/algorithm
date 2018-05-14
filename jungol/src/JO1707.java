import java.util.Scanner;

public class JO1707 {

	public static void main(String[] args) {
		// 정사각형의 크기를 입력 받은 후 시계방향으로 돌면서 다음과 같은 형태로 출력하는 프로그램을 작성하시오.

		// < 처리조건 >
		// (1) 가장 왼쪽 위의 좌표부터 차례로 숫자를 대입시킨다. 
		// (2) 오른쪽으로 채워 나가다가 끝이면 다시 아래 → 왼쪽 → 위 →오른쪽의 순으로 모두 채워질때까지 반복한다.
		
		// 1 2 3 4 5
		// 16 17 18 19 6
		// 15 24 25 20 7
		// 14 23 22 21 8
		// 13 12 11 10 9

		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int num = 1;
		int max = n;
		
		int row = 0;
		int column = -1;
		int delta = 1;
		
		// 배열에 입력받기
		while (max >= 0) {
			
			// 행입력
			for (int i = 0; i < max; i++) {
				column += delta;
				arr[row][column] = num++;
			}
			
			// 반복횟수 감소
			max--;
			
			// 열입력
			for (int i = 0; i < max; i++) {
				row += delta;
				arr[row][column] = num++;
			}
			
			// 방향전환
			delta *= -1;
			
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
