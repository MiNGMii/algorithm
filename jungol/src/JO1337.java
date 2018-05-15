import java.util.Scanner;

public class JO1337 {

	public static void main(String[] args) {
		// 삼각형의 높이 N을 입력받아서 아래와 같이 숫자 0부터 달팽이 모양으로 
		// 차례대로 채워진 삼각형을 출력하는 프로그램을 작성하시오.

		// < 처리조건 > 
		// 왼쪽 위부터 시계방향으로 오른쪽 아래로 이동하면서 숫자 0부터 N개를 채우고 다시 왼쪽으로, 
		// 다음은 위쪽으로 반복하면서 채워 나간다. (숫자 9 다음에는 0부터 다시 시작한다.)
		
		// 0
		// 4 1
		// 3 5 2
		// 2 0 6 3
		// 1 9 8 7 4
		// 0 9 8 7 6 5
		
		// 삼각형의 한변의 길이 N(N의 범위는 100 이하의 양의 정수)을 입력받는다.
		// 주어진 형태대로 높이가 N인 달팽이 삼각형을 출력한다. 숫자 사이는 한 개의 공백으로 구분한다.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = 1;
		boolean run = true;			// 입력 반복 결정
		
		while (run) {				// 조건을 충족하면 false -> 반복문 탈출
			
			if (sc.hasNextInt()) { 						// 정수여야함
				run = false;
				n = sc.nextInt();
				
				if (n < 0 || n > 100)	run = true;		// 100이상이거나 음의 정수면 다시입력
			} else {
				sc.next();			// 정수가 아닌 입력 받아서 넘기기
			}
			
			if (run == true)	System.out.print("n은 100 이하 양의정수입니다. \n재입력: ");
			
		}
		
		int[][] arr = new int[n][n];
		int num = 10;				// 0이 입력되면 출력되지않으므로 10부터 시작
		int max = n;
		
		int row = -1;
		int column = -1;
		
		// 배열에 입력받기
		while (true) {
			
			// 대각선아래
			for (int i = 0; i < max; i++) {
				row++;
				column++;
				
				arr[row][column] = num++;
			}
			
			// 반복횟수 감소
			max--;			
			if (max <= 0) break;
			
			// 열입력
			for (int i = 0; i < max; i++) {
				column--;
				
				arr[row][column] = num++;
			}
			
			// 반복횟수 감소
			max--;			
			if (max <= 0) break;
			
			// 행입력
			for (int i = 0; i < max; i++) {
				row--;
				
				arr[row][column] = num++;
			}
			
			// 반복횟수 감소
			max--;			
			if (max <= 0) break;
			
		}
		
		// 배열 출력
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if (arr[i][j] != 0) {				// 빈 배열은 0이 입력되므로 출력제외
					int temp = arr[i][j] % 10;		// 1의자리수만 담아서 출력
					System.out.print(temp + " ");
				}
				
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
