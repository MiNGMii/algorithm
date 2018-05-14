import java.util.Scanner;

public class JO1304 {

	public static void main(String[] args) {
		// 정사각형의 한 변의 길이 n을 입력받은 후 다음과 같이 
		// 숫자로 된 정사각형 형태로 출력하는 프로그램을 작성하시오. 

		// < 처리조건 > 
		// 숫자의 진행 순서는 처음에 왼쪽 위에서 아래쪽으로 n만큼 진행 한 후 
		// 바로 오른쪽 위에서 다시 아래쪽으로 진행하는 방법으로 정사각형이 될 때까지 반복한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int num = 0;
		
		// 배열에 입력받기
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				num++;
				arr[j][i] = num;
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
