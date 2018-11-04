import java.util.PriorityQueue;

public class Hotter {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 9, 10, 12};
		int k = 7;
		System.out.println(solution(A, k));
	}

	public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> foods = new PriorityQueue<Integer>();
        
        for (int food : scoville) {
        	foods.add(food);
        }
        
        while (foods.peek() < K) {
    		int temp1 = foods.poll();
    		if (foods.peek() == null)	return -1;
    		int temp2 = foods.poll();
    		
    		int newScoville = temp1 + temp2 * 2;
    		foods.add(newScoville);
    		answer++;
        }
        
        return answer;
    }
}
