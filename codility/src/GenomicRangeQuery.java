import java.util.Arrays;

public class GenomicRangeQuery {

	public static void main(String[] args) {
		String S = "CAGCCTA";
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};
		System.out.println(Arrays.toString(solution(S, P, Q)));
	}

	public static int[] solution(String S, int[] P, int[] Q) {
		int[][] arr = new int[S.length()][4];
		int[] result = new int[P.length];

		for (int i = 0; i < S.length(); i++) {
			
			switch (S.charAt(i)) {
				case 'A':
					arr[i][0] = 1;
					break;
				case 'C':
					arr[i][1] = 1;
					break;
				case 'G':
					arr[i][2] = 1;
					break;
				default:
					arr[i][3] = 1;
					break;
			}
		}
		
		for (int i = 1; i < S.length(); i++) {
			
			for (int j = 0; j < 4; j++)
				arr[i][j] += arr[i - 1][j];
		}

		for (int i = 0; i < P.length; i++) {

			for (int j = 0; j < 4; j++) {
				int sub = 0;
				
				if (P[i] - 1 >= 0)
					sub = arr[P[i] - 1][j];
				
				if (arr[Q[i]][j] - sub > 0) {
					result[i] = j + 1;
					break;
				}
			}

		}
		
		return result;
	}

}
