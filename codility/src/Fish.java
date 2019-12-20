import java.util.Stack;

public class Fish {

	public static void main(String[] args) {
		Fish f = new Fish();
		int[] A = {4,3,2,1,5};	// size
		int[] B = {0,1,0,0,0};	// direction (0:up, 1:down)
		System.out.println(f.solution(A, B));
	}
	
	public int solution(int[] A, int[] B) {
        int answer = 0;
        Stack<Integer> goingDownSt = new Stack<>();
        
        for (int i = 0; i < A.length; i++)  {
        	int fish = A[i];
        	
        	if (B[i] == 0) {
        		if (goingDownSt.isEmpty()) {
        			answer++; 
        		} else if (goingDownSt.peek() < fish) {
        			goingDownSt.pop();
        			i--;
        		}
        	} else {
        		goingDownSt.push(fish);
        	}
        }
        
        return answer + goingDownSt.size();
    }

}
