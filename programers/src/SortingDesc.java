import java.util.Arrays;

public class SortingDesc {
	
	public long solution(long n) {
		char[] arr = Long.toString(n).toCharArray();
		Arrays.sort(arr);
		
		String answer = "";
		
		for (int i = 0; i < arr.length; i++)
			answer = arr[i] + answer;
		
		return Long.parseLong(answer);
	}
}
