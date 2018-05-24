import java.util.HashMap;

public class Distinct {
	
	public static void main(String[] args) {
		int[] A = {2, 1, 1, 2, 3, 1};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < A.length; i++)
			map.put(A[i], 1);
		
		return map.size();
	}
}
