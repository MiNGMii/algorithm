import java.util.Scanner;

public class JO1719 {

	public static void main(String[] args) {
		// 삼각형의 높이 n과 종류 m을 입력받은 후 다음과 같은 삼각형 형태로 출력하는 프로그램을 작성하시오.
		// 다음은 n이 5인 경우의 예시이다.
		
		// 종류1		종류2	종류3		종류4
		// *		  *		*****		***
		// **		 **		 ***		 **
		// ***		***		  *			  *
		// **		 **		 ***		  **
		// *		  *		*****		  ***
		
		// 삼각형의 크기 n(n의 범위는 100 이하의 홀수)과 종류 m(m은 1부터 4사이의 정수)을 입력받는다
		// 위에서 언급한 3가지 종류를 입력에서 들어온 높이 n과 종류 m에 맞춰서 출력한다.
		// 입력된 데이터가 주어진 범위를 벗어나면 "INPUT ERROR!"을 출력한다. '*'과 '*' 사이에는 공백이 없다.
		
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
				
				int max = (n / 2) + 1;
				
				switch(m) {
				
					case 1:
						
						for (int i = 0; i < max; i++) {

							for (int j = 0; j <= i; j++)
								System.out.print("*");
							
							System.out.println();
						}
						
						for (int i = 0; i < max; i++) {
							
							for (int j = 1; j < max - i; j++)
								System.out.print("*");
							
							System.out.println();
						}
						
						break;
						
					case 2:
		
						for (int i = 0; i < max; i++) {
							
							for (int j = 1; j < max - i; j++)
								System.out.print(" ");
							
							for (int j = 0; j <= i; j++)
								System.out.print("*");
							
							System.out.println();
						}
						
						for (int i = 0; i < max; i++) {
							
							for (int j = 0; j <= i; j++)
								System.out.print(" ");
							
							for (int j = 1; j < max - i; j++)
								System.out.print("*");
							
							System.out.println();
						}
						
						break;
						
					case 3:
		
						for (int i = max - 1; i >= 0; i--) {

							for (int j = 1; j < max - i; j++)
								System.out.print(" ");
							
							for (int j = 0; j <= 2*i; j++)
								System.out.print("*");
							
							System.out.println();
						}
						
						for (int i = 1; i < max; i++) {
							
							for (int j = 1; j < max - i; j++)
								System.out.print(" ");
							
							for (int j = 0; j <= 2*i; j++)
								System.out.print("*");
							
							System.out.println();
						}
						
						break;	
						
					case 4:
						
						for (int i = max - 1; i >= 0; i--) {

							for (int j = 1; j < max - i; j++)
								System.out.print(" ");
							
							for (int j = 0; j <= i; j++)
								System.out.print("*");
							
							System.out.println();
						}
						
						for (int i = 1; i < max; i++) {
							
							for (int j = 1; j < max; j++)
								System.out.print(" ");
							
							for (int j = 0; j <= i; j++)
								System.out.print("*");
							
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
