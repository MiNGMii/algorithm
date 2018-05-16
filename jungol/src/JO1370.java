import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JO1370 {

	public static void main(String[] args) {
		// 회의실이 하나 있다. 
		// 여러 회의들이 시작시간과 종료시간이 예약되어 있으며, 시간대가 겹치는 회의는 동시에 개최가 불가능하다. 
		// 따라서 같은 시간대에 속하는 회의들 중 하나만 개최하고 나머지 회의들은 버려야한다. 
		// 단, 종료시간과 시작시간이 같은 경우에는 시간이 겹친다고 말하지 않는다. 
		// 회의의 개수 N과 각 회의의 시작시간, 종료시간이 주어졌을 때 되도록 많은 회의를 개최하고자 한다. 
		// 회의를 최대한 많이 배정하는 프로그램을 작성하시오.
		
		// 첫줄에는 회의의 수 N(5≤N≤500), 
		// 둘째 줄부터 i-1번 회의의 번호와 시작시간과 종료시간이 차례로 주어진다. (500 이하의 자연수)
		
		// 첫줄에는 배정 가능한 최대의 회의수를 출력하고 
		// 다음 줄부터는 배정한 회의의 번호를 시간대순으로 출력한다. 
		// 만약, 답이 여러 가지(최대회의수가 될 수 있는 배정 방법이 여러가지)라면 그 중 아무거나 하나 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회의의 수: ");
		int n = 0;

		while (true) {
			
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				
				if (n >= 5 && n <= 500)	break;

			} else {
				sc.next();
			}
			
			System.out.print("회의 수는 최소 5개, 최대 500개 입니다. \n재입력> ");
		}
		
		int[][] timetable = new int[n][3];
		
		// 배열에 회의 시간표 입력받기
		System.out.println("회의번호 시작시간 종료시간 순으로 입력해주세요.");
		
		for (int i = 0; i < n; i++) {	
			
			// 0-번호	1-시작시간	2-종료시간
			timetable[i][0] = sc.nextInt();
			timetable[i][1] = sc.nextInt();
			timetable[i][2] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(timetable, new Comparator<int[]>() {

			@Override
			public int compare(int[] before, int[] after) {
				
				// before[1], after[1] -> timetable[i][1]: 시작시간
				// before[2], after[2] -> timetable[i][2]: 종료시간
                if (before[2] == after[2]) {
                	
                    // 종료시간이 같을 경우 시작시간 비교
                    return Integer.compare(before[1], after[1]);
                }
                
                // 같지 않으면 종료시간 비교
                return Integer.compare(before[2], after[2]);
            }
				
		});
		
		int count = 0;		// 배정한 회의 개수
		int lastEnd = -1;	// 이전 종료시간
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			
			if (timetable[i][1] >= lastEnd) {
				lastEnd = timetable[i][2];
				
				count++;
				arr[i] = timetable[i][0];
			}
		}
		
		System.out.println(count);
		
		for (int i = 0; i < n; i++) {
			
			if (arr[i] != 0)
				System.out.print(arr[i] + " ");
		}
	}


}
