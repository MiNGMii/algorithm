import java.util.Arrays;

class TryHelloWorld3 {
	
	public int getMinSum(int[] A, int[] B) {
		int answer = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[A.length - i - 1];
			/*System.out.println(answer);*/
		}

		return answer;
	}

	public static void main(String[] args) {
		TryHelloWorld3 test = new TryHelloWorld3();
		int[] A = { 1, 2 };
		int[] B = { 3, 4 };
		System.out.println(test.getMinSum(A, B));
	}
}