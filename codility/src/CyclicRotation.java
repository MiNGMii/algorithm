import java.util.Arrays;

public class CyclicRotation {
	
	public static void main(String[] args) {
		
		int[] array = {3, 8, 9, 7, 6};
		
		System.out.println(Arrays.toString(solution(array, 3)));
	}
	
	public static int[] solution(int[] A, int K) {
		
		if (A.length == 0) return A;
		
		for (int i = 0; i < K; i++) {
			int temp = A[A.length - 1];
			
			for (int j = A.length - 1; j > 0; j--) {
				A[j] = A[j - 1];
			}
			
			A[0] = temp;
		}
		
		return A;
    }
}
