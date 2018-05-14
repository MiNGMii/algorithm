import java.util.Scanner;

public class JO1307 {

	public static void main(String[] args) {
		// 정사각형의 한 변의 길이 n을 입력받은 후 
		// 다음과 같은 문자로 된 정사각형 형태로 출력하는 프로그램을 작성하시오.

		// < 처리조건 > 
		// 문자의 진행 순서는 맨 오른쪽 아래에서 위쪽으로 'A'부터 차례대로 채워나가는 방법으로 
		// 아래 표와 같이 왼쪽 위까지 채워 넣는다. 'Z' 다음에는 다시 'A'부터 반복된다.
		
		// P L H D
		// O K G C
		// N J F B
		// M I E A
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		
		char[][] arr = new char[n][n];
		char input = 'A';
		
		// 배열에 입력받기
		for (int i = n - 1; i >= 0; i--) {
				
			for (int j = n - 1; j >= 0; j--)
				arr[j][i] = input++;
			
		}
		
		// 배열 출력
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
		}

	}

}
