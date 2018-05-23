import java.util.Arrays;
import java.util.HashMap;

public class MissingInteger {

	public static void main(String[] args) {
		int[] A = {0, 3, 6, 4, 5, 2};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		Arrays.sort(A);
		/*System.out.println(Arrays.toString(A));*/
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < A.length; i++)
			map.put(A[i], A[i]);
		
		for (int i = 1; i <= A.length; i++) {
			
			if (map.get(i) == null)
				return i;
		}
		
		return A[A.length - 1] + 1;
	}
}
