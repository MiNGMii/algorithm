import java.util.Arrays;

public class KthNumber2 {

	public static void main(String[] args) {
		int[] A = {1, 5, 2, 6, 3, 7, 4};
		int[][] B = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(Arrays.toString(solution(A, B)));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
        	int[] command = commands[i];
        	int[] temp = Arrays.copyOfRange(array, command[0] - 1, command[1]);
        	
        	Arrays.sort(temp);
        	answer[i] = temp[command[2] - 1];
        }
        
        return answer;
    }
}
