import java.util.Scanner;

public class JO2046 {

	public static void main(String[] args) {
		// 정사각형의 한 변의 길이 n과 종류 m을 입력받은 후 
		// 다음과 같은 정사각형 형태로 출력하는 프로그램을 작성하시오.

		// < 처리조건 >
		// 종류 2번의 경우 숫자의 진행 순서는 처음에 왼쪽에서 오른쪽으로 너비 n만큼 진행 한 후 
		// 방향을 바꾸어서 이를 반복한다.
		
		// 종류1.		종류2.		종류3.
		// 11111		12345		12345
		// 22222		54321		246810
		// 33333		12345		3691215
		// 44444		54321		48121620
		// 55555		12345		510152025
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("길이: ");
		int n = sc.nextInt();
		
		System.out.print("종류: ");
		int m = sc.nextInt();
		
		int[][] arr = new int[n][n];
		boolean run = true;
		
		// m에 따라서 배열 입력받기
		switch (m) {
			case 1:
				
				for (int i = 0; i < n; i++) {
					
					for (int j = 0; j < n; j++)
						arr[i][j] = i + 1;
				}
				
				break;
				
			case 2:
				
				for (int i = 0; i < n; i++) {
					
					for (int j = 0; j < n; j++) {
						
						if (i % 2 == 0)
							arr[i][j] = j + 1;
						else
							arr[i][j] = n - j;		
					}
				}
				
				break;
				
			case 3:
				
				for (int i = 0; i < n; i++) {
					
					for (int j = 0; j < n; j++)
						arr[i][j] = (i + 1) * (j + 1);
				}
				
				break;
			
			default: 
				run = false;
				System.out.println("종류는 1, 2, 3 중에 입력해주세요.");
				break;
		}
		
		// 입력이 제대로 된 경우 배열 출력
		if (run) {
			
			for (int i = 0; i < n; i++) {
				
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				
				System.out.println();
			}
		}
	}

}
