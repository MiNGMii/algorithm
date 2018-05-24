
public class TwoxN {

	public int solution(int n) {
		int[] answer = new int[n + 1];
		
		for (int i = 0; i < 3; i++) {
			
			if (n >= i)	answer[i] = i; 
		}
		
		for (int i = 3; i <= n; i++) {
			answer[i] = (answer[i - 1] + answer[i - 2]) % 1000000007;
		}
		
		return answer[n];
	}
}
