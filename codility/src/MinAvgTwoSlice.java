
public class MinAvgTwoSlice {

	public static void main(String[] args) {
		int[] A = {4, 2, 2, 5, 1, 5, 8};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int answer = 0;
		double avg = Double.MAX_VALUE;
		
		for (int i = 0; i < A.length - 2; i++) {
			double avg2 = (A[i] + A[i + 1]) / 2.0;
			double avg3 = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
			
			if (avg > Math.min(avg2, avg3)) {
				avg = Math.min(avg2, avg3);
				answer = i;
			}
			
			System.out.println(avg2);
			System.out.println(avg3);
			System.out.println(avg + "," + answer);
		}
		
		if (avg > (A[A.length - 2] + A[A.length - 1]) / 2.0) {
			avg = (A[A.length - 2] + A[A.length - 1]) / 2.0;
			answer = A.length - 2;
		}
		
		return answer;
	}

}
