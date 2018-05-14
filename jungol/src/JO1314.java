import java.util.Scanner;

public class JO1314 {

	public static void main(String[] args) {
		// 정사각형의 한 변의 길이 n을 입력받은 후 다음과 같은 문자로 된 정사각형 형태로 출력하는 프로그램을 작성하시오.

		// < 처리조건 > 
		// 문자의 진행 순서는 왼쪽 위에서부터 아래쪽으로 ‘A'부터 차례대로 채워나가고 
		// 다시 오른쪽 아래부터 위쪽으로 채워나가는 방법으로 아래 표와 같이 채워 넣는다. 
		// 'Z' 다음에는 다시 'A'부터 반복된다.
		
		// A H I P
		// B G J O
		// C F K N
		// D E L M

		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		
		char[][] arr = new char[n][n];
		char input = 'A';
		
		// 배열에 입력받기
		for (int i = 0; i < n; i++) {
			
			if (i % 2 == 0) {
				
				for (int j = 0; j < n; j++) {
					
					if (input > 'Z') {
						input = 'A';
					}
					
					arr[j][i] = input++;
				}
				
			} else {
				
				for (int j = n - 1; j >= 0; j--) {
					
					if (input > 'Z') {
						input = 'A';
					}
					
					arr[j][i] = input++;
				}
			}
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
