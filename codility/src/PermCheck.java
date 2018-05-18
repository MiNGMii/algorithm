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
        
        if (A[0] != 1)	return 0;
        
        if (A.length == 2 && A[0] != A[1] - 1)	return 0;
        
        for (int i = 1; i < A.length - 1; i++) {
        	
        	if (A[i] != A[i-1] + 1 || A[i] != A[i+1] - 1)
        		return 0;
        }
		
		return 1;
    }
}
