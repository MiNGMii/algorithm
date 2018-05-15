import java.util.Scanner;

public class JO1329 {

	public static void main(String[] args) {
		// 삼각형의 높이 N을 입력받아 아래와 같은 모양을 출력하는 프로그램을 작성하시오.
		
		// *
		//  ***
		//   *****
		//    *******
		//   *****
		//  ***
		// *
		
		// 삼각형의 높이 N(N의 범위는 100 이하의 양의 홀수)을 입력받는다.
		// N의 높이에 맞추어 주어진 형태의 모양을 출력한다. 
		// 입력된 데이터가 주어진 범위를 벗어나면 "INPUT ERROR!"를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("크기: ");
		
		if (sc.hasNextInt()) {						// 입력된 값이 정수인지 확인
		
			int n = sc.nextInt();
			
			if (n % 2 == 0 || n < 0 || n > 100) {	// 100 이하 양의 홀수가 아니면 에러 메시지
				System.out.println("INPUT ERROR!");
				
			} else {
				
				for (int i = 0; i <= n; i += 2) {

					for (int j = 1; j <= i / 2; j++)
						System.out.print(" ");
					
					for (int j = 0; j <= i; j++)
						System.out.print("*");
					
					System.out.println();
				}

				int max = (n / 2) + 1;
				
				for (int i = 2; i <= n; i += 2) {
					
					for (int j = 1; j < max - (i/2); j++)
						System.out.print(" ");
					
					for (int j = 0; j < n - i; j++)
						System.out.print("*");
					
					System.out.println();
				}
			}
			
		} else {
			System.out.println("INPUT ERROR!");
		}
		
		sc.close();
	}

}
