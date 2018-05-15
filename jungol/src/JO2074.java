import java.util.Scanner;

public class JO2074 {

	public static void main(String[] args) {
		// 홀수 정사각형의 크기를 입력 받은 후, 
		// 가로 세로 대각선의 합이 일정한 마방진을 출력하는 프로그램을 작성하시오.
		// 마방진이란 1부터 N*N까지의 숫자를 한 번씩만 써서 정사각형에 배치하여 
		// 가로와 세로, 그리고 대각선의 합이 같도록 하는 것이다.

		// 다음의 순서에 따라 각 위치에 차례대로 값을 넣는다.
		// 1. 첫 번째 숫자인 1을 넣는 위치는 첫 번째 행 가운데이다.
		// 2. 숫자가 N의 배수이면 바로 아래의 행으로 이동하여 다음의 수를 넣고
		// 3. 그렇지 않으면 왼쪽 위로 이동하여 다음의 숫자를 넣는다. 
		// 	    만약 행이 첫 번째를 벗어나면 마지막 행으로 이동하고, 
		//    열이 첫 번째를 벗어나면 마지막 열로 이동한다.

		// 1. 첫 번째 행 가운데(1,2)에 1을 넣는다.
		// 2. 왼쪽 위로 이동하면 (0,1)인데 
		//    행의 위치가 처음을 벗어났으므로 마지막행(3,1)의 위치로 이동하여 2를 넣는다.
		// 3. 왼쪽 위로 이동하면 (2,0)인데 
		//    열의 위치가 처음을 벗어났으므로 마지막열(2,3)의 위치로 이동하여 3을 넣는다.
		// 4. 배열에 넣은 값(3)이 N의 배수이므로 바로 아래행으로(3,3) 이동하여 4를 넣는다.
		// 5. 왼쪽 위로 이동하여 (2,2) 5를 넣는다.
		// 6. 왼쪽 위로 이동하여 (1,1) 6를 넣는다.
		// 7. 배열에 넣은 값(6)이 N의 배수이므로 바로 아래행으로(2,1) 이동하여 7을 넣는다.
		// 8. 왼쪽 위로 이동하면 (1,0)인데 
		//    열의 위치가 처음을 벗어났으므로 마지막열(1,3)의 위치로 이동하여 8을 넣는다.
		// 9. 왼쪽 위로 이동하면 (0,2)인데 
		//    행의 위치가 처음을 벗어났으므로 마지막행(3,2)의 위치로 이동하여 9를 넣는다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		
		while (n % 2 == 0 || n < 2 || n > 100) {
			System.out.println("n은 2와 100 사이의 홀수입니다.");
			System.out.print("n: ");
			n = sc.nextInt();
		}
		
		int[][] arr = new int[n][n];
		int x = 0;
		int y = n / 2;
		
		// 배열에 입력받기
		for (int i = 1; i <= n * n; i++) {
			
			arr[x][y] = i;
			
			if (i % n == 0) {
				x++;
				
			} else {
				x--;
				y--;
				
				if (x < 0) 	x = n - 1;
				if (y < 0) 	y = n - 1;
			}
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
