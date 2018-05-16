import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JO1669 {

	public static void main(String[] args) {
		// 영훈이가 소시지 공장에 견학을 갔다. 
		// 그 소시지공장에서는 하나의 기계가 길이와 너비가 다양한 소시지를 만들어 내고 있었다.
		
		// 유심히 살펴보니 그 기계는 현재 만들고 있는 소시지의 길이와 너비가 
		// 바로 전에 만들었던 소시지의 길이, 너비보다 크거나 같아야만 
		// 기계가 쉬지 않고 작동하고 있었다. 
		// 만약 현재 만들고 있는 소시지의 길이 또는 너비가 바로 전에 만든 것보다 작다면, 
		// 기계가 준비 작업을 하는데 1분이 소요된다는 것을 알았다. 

		// 영훈이는 주문 받은 소시지의 길이와 너비를 보고 어떤 소시지부터 만들어 나가는 것이 
		// 기계의 준비 작업에 소요되는 시간을 줄일 수 있을지 고민하고 있다. 
		// 주문받은 소시지들을 만드는데 기계가 준비 작업에 소요한 최소의 시간을 구하는 프로그램을 작성하시오. 
		// 단, 첫 소시지를 만들 때는 기계의 준비작업 시간이 1분 소요된다.
		
		// 첫 줄에는 주문받은 소시지의 개수 N(1≤N≤5,000)이다.
		// 둘째 줄에는 소시지의 길이 SL과 소시지의 너비 SW가 N개의 쌍으로 나열된다.
		
		// 주문받은 소시지들을 만드는데 기계가 준비 작업에 소요한 최소의 시간을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = 1;
		
		System.out.print("개수> ");
		
		while(true) {
			
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				
				if (n >= 1 && n <= 5000)	break;
				
			} else {
				sc.next();
			}
			
			System.out.print("소시지는 1개 이상 5000개 미만입니다. \n개수> ");
		}
		
		// 소시지 크기 입력받기
		System.out.println("소시지의 길이 너비 순으로 입력하세요.");
		int[][] size = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			size[i][0] = sc.nextInt();	// SL: 길이
			size[i][1] = sc.nextInt();	// SW: 너비
		}
		
		sc.close();
		
		// 최초 준비작업시간인 1분을 넣어놓고 시작
		int makeTimeL = 1;
		int makeTimeW = 1;
		
		// 길이로 정렬
		Arrays.sort(size, new Comparator<int[]>() {

			@Override
			public int compare(int[] before, int[] after) {
				
				// 길이 같으면 너비 비교
                if (before[0] == after[0])
                    return Integer.compare(before[1], after[1]);
                
                return Integer.compare(before[0], after[0]);
            }
				
		});
		
		for (int i = 1; i < n; i++) {
			
			if (size[i][0] < size[i-1][0] || size[i][1] < size[i-1][1])
				makeTimeL++;	
		}
		
		// 너비로 정렬
		Arrays.sort(size, new Comparator<int[]>() {

			@Override
			public int compare(int[] before, int[] after) {
				
				// 너비 같으면 길이 비교
                if (before[1] == after[1])
                    return Integer.compare(before[0], after[0]);
                
                return Integer.compare(before[1], after[1]);
            }
				
		});
		
		for (int i = 1; i < n; i++) {
			
			if (size[i][0] < size[i-1][0] || size[i][1] < size[i-1][1])
				makeTimeW++;	
		}
		
		int answer = makeTimeL < makeTimeW? makeTimeL : makeTimeW;
		
		System.out.println(answer);
	}

}
