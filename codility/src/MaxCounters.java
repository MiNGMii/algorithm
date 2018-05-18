import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		int[] A = {3, 4, 4, 6, 1, 4, 4};
		System.out.println(Arrays.toString(solution(5, A)));
	}
	
	// 정확도는 100%지만 시간복잡도 초과ㅠㅠ
	public static int[] solution(int N, int[] A) {
        int[] result = new int [N];
        int max = 0;
        
        for (int i = 0; i < A.length; i++) {
        	
        	if (A[i] >= 1 && A[i] <= N) {
        		result[A[i] - 1]++;
        		
        		if (max < result[A[i] - 1])	
        			max = result[A[i] - 1];
        	}
        	
        	if (A[i] > N) {
        		final int MAX = max;
        		Arrays.setAll(result, (inex) -> MAX);
        	}
        }
        
		return result;
    }
}
