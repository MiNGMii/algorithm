import java.util.Arrays;

public class BestGroup {

	public int[] solution(int n, int s) {
		int mid = s / n;
		int sum = 0;
		int[] answer = new int[n];
		int[] ret = {-1};
		
		if (n > s) return ret;
		
		for (int i = 0; i < n; i++) {
			answer[i] = mid;
			sum += answer[i];
		}
		
		for (int i = 0; i < n; i++) {
			
			if (sum == s) 	{
				Arrays.sort(answer);
				return answer;
			}
			
			answer[i]++;
			sum++;
		}
		
		return ret;
	}
}
