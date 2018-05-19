
public class CountDiv {
	
	public static void main(String[] args) {
		System.out.println(solution(6, 11, 2));	// 3
		System.out.println(solution(0, 13, 2));	// 7
		System.out.println(solution(11, 345, 17));	// 20
	}
	
	public static int solution(int A, int B, int K) {
		
		if (A == 0)
			return B / K + 1;
		else
			return B / K - (A - 1) / K;
    }
}
