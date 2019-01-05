import java.util.Arrays;

public class KthNumber {

	public static void main(String[] args) {
		int[] A = {1, 5, 2, 6, 3, 7, 4};
		int[][] B = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(Arrays.toString(solution(A, B)));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
        	int[] command = commands[i];
        	int[] temp = new int[command[1] - command[0] + 1];
        	int key = 0;
        	
        	for (int j = command[0] - 1; j <= command[1] - 1; j++) {
        		temp[key++] = array[j];
        	}
        	
        	Arrays.sort(temp);
        	answer[i] = temp[command[2] - 1];
        }
        
        return answer;
    }
}
