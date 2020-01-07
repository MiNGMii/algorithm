
public class BinaryGap {

	public static void main(String[] args) {
		
		System.out.println(solution(1041));
	}
	
	public static int solution(int N) {
        
		String input = Integer.toBinaryString(N);
		int[] arr = new int[input.length()];
		int pos = 0;
		
		for (int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == '1')	arr[pos++] = i;
		}
		
		int result = arr[1] - arr[0] - 1;
		
		for (int i = 2; i < arr.length; i++) {
			
			if (result < arr[i] - arr[i-1] - 1)	result = arr[i] - arr[i-1] - 1;
		}
		
		if (result < 0) result = 0;
		
		return result;
    }
}
