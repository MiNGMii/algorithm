
public class PassingCars {

	public static void main(String[] args) {
		int[] A = {0, 1, 0, 1, 1};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int result = 0;
		int sum = 0;
		
        for (int i = 0; i < A.length; i++) {
        	
        	if (A[i] == 0)
        		sum++;
        	else
        		result += sum;
        }
        
        if (result > 1000000000 || result < 0)	return -1;
        
		return result;
    }
}
