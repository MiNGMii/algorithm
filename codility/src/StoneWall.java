import java.util.Stack;

public class StoneWall {

	public static void main(String[] args) {
		StoneWall s = new StoneWall();
		int[] H = {8,8,5,7,9,8,7,4,8};
		System.out.println(s.solution(H));

	}
	
    public int solution(int[] H) {
    	int answer = 0;
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < H.length; i++) {
        	
        	if (s.empty() || H[i] > s.peek()) {
        		answer++;
        		s.add(H[i]);
        	} else if (H[i] < s.peek()) {
        		s.pop();
        		i--;
        	}
        }
        
        return answer;
    }

}
