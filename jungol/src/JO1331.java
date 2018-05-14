import java.util.Scanner;

public class JO1331 {

	public static void main(String[] args) {
		// 마름모의 한 변의 길이 N을 입력받아 아래와 같이 문자마름모를 출력하는 프로그램을 작성하시오.

		// < 처리조건 > 
		// (1) 첫 번째 행의 중앙부터 출발하여 시계 반대방향으로 'A'부터 차례대로 채워나간다. 
		// 	   ('Z'다음에는 다시 'A'가 된다.)
		// (2) 바깥 부분이 다 채워지면 두 번째 행 중앙부터 다시 같은 작업을 반복한다.
		// (3) 같은 방법으로 마름모를 다 채워지도록 하여 출력한다.
		
		//       A
	    //     B M L
	    //   C N U T K
		// D O V Y X S J
	    //   E P W R I
	    //     F Q H
	    //       G

		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		
		int size = 2 * n - 1;		// 배열크기계산
		int max = n;				// 반복횟수
		
		char[][] arr = new char[size][size];
		char input = 'A';
		
		int row = -1;				// 행번호
		int column = n;				// 열번호
		int rdelta = 1;				// 행 증분값
		int cdelta = -1;			// 열 증분값
		
		// 배열에 입력받기
		while (max > 0) {
			
			// 왼쪽아래입력
			for (int i = 0; i < max; i++) {
				row += rdelta;
				column += cdelta;
				
				arr[row][column] = input;
				
				input++;
				if (input > 'Z') input = 'A';
			}
			
			max--;			// 반복횟수 감소
			cdelta *= -1;	// 열 입력방향 전환
			
			// 오른쪽아래입력
			for (int i = 0; i < max; i++) {
				row += rdelta;
				column += cdelta;
				
				arr[row][column] = input;
				
				input++;
				if (input > 'Z') input = 'A';
			}
			
			rdelta *= -1;	// 행 입력반환 전환
			
			// 오른쪽위입력
			for (int i = 0; i < max; i++) {
				row += rdelta;
				column += cdelta;
				
				arr[row][column] = input;
				
				input++;
				if (input > 'Z') input = 'A';
			}
			
			max--;			// 반복횟수 감소
			cdelta *= -1;	// 열 입력방향 전환
			
			// 왼쪽위입력
			for (int i = 0; i < max; i++) {
				row += rdelta;
				column += cdelta;
				
				arr[row][column] = input;
				
				input++;
				if (input > 'Z') input = 'A';
			}

			max++;			// 반복횟수 증가
			row--;			// 시작 행 증가
			rdelta *= -1;	// 행 입력반환 전환
			
		}
		
		// 배열 출력
		for (int i = 0; i < size; i++) {
			
			for (int j = 0; j < size; j++) {
				
				// 문자가 입력된 곳만 출력하고 나머지는 빈칸처리한다.
				if (arr[i][j] != 0)
					System.out.print(arr[i][j] + " ");
				else
					System.out.print("  ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
