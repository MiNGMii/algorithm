import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		int[] A = {4, 1, 3, 2};
		int[] B = {4, 1, 3};
		int[] C = {3, 1};
		System.out.println(solution(A));
		System.out.println(solution(B));
		System.out.println(solution(C));
	}
	
	public static int solution(int[] A) {
		Arrays.sort(A);
        
        for (int i = 1; i <= A.length; i++) {
        	
        	if (A[i - 1] != i)
        		return 0;
        }
		
		return 1;
    }
}
