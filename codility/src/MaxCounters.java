import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		int[] A = {3, 4, 4, 6, 1, 4, 4};
		System.out.println(Arrays.toString(solution(5, A)));
	}
	
	public static int[] solution(int N, int[] A) {
        int[] answer = new int[N];
		int tempNum = 0;
		int maxNum = 0;
        
		for (int i = 0; i < A.length; i++) {
			
			if (A[i] > N) {
				maxNum = tempNum;
				continue;
			}
			
			if (answer[A[i] - 1] < maxNum)
				answer[A[i] - 1] = maxNum;
             
			answer[A[i] - 1]++;
             
            if (answer[A[i] - 1] > tempNum)
                tempNum = answer[A[i] - 1];
		}
		
		for (int i = 0; i < N; i++) {
			
			if (answer[i] < maxNum)
				answer[i] = maxNum;
		}
		
		return answer;
    }
}
