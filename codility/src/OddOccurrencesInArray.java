
public class OddOccurrencesInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {9, 3, 9, 3, 7, 9, 9};
		
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] A) {
		
		int result = 0;
		
		// 동일 숫자와 bit xor 연산 하면 상쇄되어 0이 된다.
		// 짝수개의 숫자는 모두 상쇄되고 홀수개의 숫자는 짝수개만큼 상쇄되고 마지막에 하나가 남게 된다.
		// 0과 숫자를 xor 연산하면 숫자가 나온다. 
		// 위의 테스트케이스에서는 (3, 3), (9, 9), (9, 9), 7의 xor 연산으로 result에는 7이 남게 된다.
		for (int i = 0; i < A.length; i++)
			result = result ^ A[i];
		
		return result;
    }
}
