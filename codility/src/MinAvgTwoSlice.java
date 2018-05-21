
public class MinAvgTwoSlice {

	public static void main(String[] args) {
		int[] A = {4, 2, 2, 5, 1, 5, 8};
		System.out.println(solution(A));
	}
	
	// 답은 맞지만 시간복잡도 초과 ^^..!
	public static int solution(int[] A) {
		
		double[][] arr = new double[A.length - 1][A.length];
		double min = (A[0] + A[1]) / 2;
		int minKey = 0;
		/*System.out.println("min : " + min);*/
		
		for (int i = 0; i < A.length - 1; i++) {
			arr[i][i + 1] = A[i] + A[i + 1];
			
			for (int j = i + 2; j < A.length; j++) {
				arr[i][j] = arr[i][j - 1] + A[j];
			}
		}
		
		for (int i = 0; i < A.length - 1; i++) {
			
			for (int j = i + 1; j < A.length; j++) {
				arr[i][j] /= (j - i + 1);
				/*System.out.println(arr[i][j]);*/
			}
		}
		
		for (int i = 0; i < A.length - 1; i++) {
			
			for (int j = i + 1; j < A.length; j++) {
				
				if (min > arr[i][j]) {
					min = arr[i][j];
					minKey = i;
					
				/*System.out.println("min: " + min);
				System.out.println("minKey: " + minKey);*/
				}
			}
		}
		
		return minKey;
	}

}
