import java.util.Arrays;

public class MaxProductOfThree {
	
	public static void main(String[] args) {
		int[] A = {-3, 1, 2, -2, 5, 6};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		Arrays.sort(A);
		
		int i = A.length - 1;
		int answer = A[i] * A[i - 1] * A[i - 2];
		
		if (A[0] <= 0 && A[1] <= 0 && A[i] >= 0) {
			int answer2 = A[0] * A[1] * A[i];
			
			if (answer2 > answer)	answer = answer2;
		}
		
		return answer;
	}
}
