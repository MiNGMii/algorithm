
public class TapeEquilibrium2 {
	
	public static void main(String[] args) {
		TapeEquilibrium2 te = new TapeEquilibrium2();
		int[] A = {3, 1, 2, 4, 3};
		System.out.println(te.solution(A));
	}
	
	public int solution(int[] A) {
        
		int min = Integer.MAX_VALUE;

		int[] before = new int[A.length];
		int[] after = new int[A.length];
		
		before[0] = A[0];
		after[A.length - 1] = A[A.length - 1];
		
		for (int i = 1; i < A.length - 1; i++)
			before[i] = before[i - 1] + A[i];
		
		for (int i = A.length - 2; i > 0; i--)
			after[i] = after[i + 1] + A[i];
		
		for (int i = 0; i < A.length - 2; i++)
		if (min > Math.abs(before[i] - after[i + 1]))
			min = Math.abs(before[i] - after[i + 1]);
		
		return min;
    }
}
