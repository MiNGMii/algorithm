import java.util.Scanner;

public class JO1641 {

	public static void main(String[] args) {
		// 삼각형의 높이 n과 종류 m을 입력받은 후 다음과 같은 삼각형 형태로 출력하는 프로그램을 작성하시오.

		// < 처리조건 >
		// 종류 1번의 숫자의 진행 순서는 처음에 왼쪽에서 오른쪽으로 진행 한 후 방향을 바꾸어서 이를 반복한다.
		
		// 종류 1				종류 2					종류3
		// 1				0 0 0 0 0 0 0 0 0		1
		// 3  2				  1 1 1 1 1 1 1			1 2
		// 4  5  6			    2 2 2 2 2			1 2 3
		// 10 9  8  7			  3 3 3				1 2
		// 11 12 13 14 15			4				1
		
		// 삼각형의 크기 n(n의 범위는 100 이하의 홀수)과 종류 m(m은 1부터 3사이의 정수)을 입력받는다.
		// 위에서 언급한 3가지 종류를 입력에서 들어온 높이 n과 종류 m에 맞춰서 출력한다. 
		// 숫자사이는 공백으로 구분한다.
		// 입력된 데이터가 주어진 범위를 벗어나면 "INPUT ERROR!"을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("크기: ");
		
		if (sc.hasNextInt()) {						// 입력된 값이 정수인지 확인
		
			int n = sc.nextInt();
			
			if (n % 2 == 0 || n < 0 || n > 100) {	// 100 이하 홀수가 아니면 에러 메시지
				System.out.println("INPUT ERROR!");
				
			} else {
		
				System.out.print("종류: ");
				int m = 0;
				
				if (sc.hasNextInt())				// 정수인지 확인
					m = sc.nextInt();
				
				int size = 2 * n - 1;
				int[][] arr = new int[n][size];
				
				switch(m) {
				
					case 1:
						
						int num = 1;
						
						for (int i = 0; i < n; i++) {
							
							if (i % 2 == 0) {
								
								for (int j = 0; j <= i; j++)
									arr[i][j] = num++;
								
							} else {

								for (int j = i; j >= 0; j--)
									arr[i][j] = num++;
								
							}
						}
						
						for (int i = 0; i < n; i++) {
							
							for (int j = 0; j < n; j++) {
								
								if (arr[i][j] == 0)
									System.out.print("   ");
								else
									System.out.printf("%2d ", arr[i][j]);
							}
							
							System.out.println();
						}
						
						break;
						
					case 2:
		
						for (int i = 0; i < n; i++) {
							
							for (int j = 0; j < i; j++)
								System.out.print("   ");
							
							for (int j = 0; j < size - (2 * i); j++)
								System.out.printf("%2d ", i);
							
							System.out.println();
						}
						
						break;
						
					case 3:
		
						int max = n / 2 + 1;
						
						for (int i = 0; i < max; i++) {
							
							for (int j = 0; j <= i; j++)
								System.out.printf("%2d ", j + 1);
							
							System.out.println();
						}
						
						for (int i = max; i > 1; i--) {
							
							for (int j = 1; j < i; j++)
								System.out.printf("%2d ", j);
							
							System.out.println();
						}
						
						break;	
					
					default:
						System.out.println("INPUT ERROR!");
						break;
				}
				
			}
			
		} else {
			System.out.println("INPUT ERROR!");
		}
		
		sc.close();
	}

}
