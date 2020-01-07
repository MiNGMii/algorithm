
public class TapeEquilibrium {
	
	public static void main(String[] args) {
		TapeEquilibrium te = new TapeEquilibrium();
		int[] A = {3, 1, 2, 4, 3};
		System.out.println(te.solution(A));
	}
	
	// 답은 맞지만 시간복잡도 초과..
	public int solution(int[] A) {
        
		int min = Integer.MAX_VALUE;
		
		for (int i = 1; i < A.length; i++) {
			
			int before = 0;
			int after = 0;
			
			for (int j = 0; j < i; j++) {
				before += A[j];
			}
			
			for (int j = i; j < A.length; j++) {
				after += A[j];
			}
			
			
			if (min > Math.abs(before - after))
				min = Math.abs(before - after);
		}
		
		return min;
    }
}
