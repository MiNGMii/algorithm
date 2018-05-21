import java.util.Arrays;

public class GenomicRangeQuery {

	public static void main(String[] args) {
		String S = "CAGCCTA";
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};
		System.out.println(Arrays.toString(solution(S, P, Q)));
	}
	
	// 답은 맞지만 시간복잡도 초과..
	public static int[] solution(String S, int[] P, int[] Q) {
        
		char[] input = S.toCharArray();
		
		char dna[] = new char[P.length];
		
		for (int i = 0; i < P.length; i++) {
			char temp = 'T';
			
			for (int j = P[i]; j <= Q[i]; j++) {
				
				if (temp > input[j])	temp = input[j];
			}
			
			dna[i] = temp;
			
		}
		
		int[] result = new int[dna.length];
		
		for (int i = 0; i < dna.length; i++) {
			
			if (dna[i] == 'A')		result[i] = 1;
			else if (dna[i] == 'C')	result[i] = 2;
			else if (dna[i] == 'G')	result[i] = 3;
			else					result[i] = 4;
		}
		
		return result;
    }
	
}
