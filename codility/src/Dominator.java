import java.util.HashMap;

public class Dominator {

	public static void main(String[] args) {
		Dominator d = new Dominator();
		System.out.println(d.solution(new int[] {1, 3, 4, 3, 2, 3, -1, 3, 3}));
	}
	
    public int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int candidate = -1;
        int answer = -1;
        int val = -1;
        int size = 0;
        int tmpVal = 0;
        int tmpAns = 0;
        int count = 0;
        
        for (int i = 0; i < A.length; i++) {
        	if (size == 0) {
        		size++;
        		tmpVal = A[i];
        		tmpAns = i;
        	} else if (tmpVal != A[i]) {
        		size--;
        	} else {
        		size++;
        	}	
        	
        	System.out.println(size + "" + tmpVal + tmpAns);
        }
        
        if (size > 0) {
        	candidate = tmpAns;
        	val = tmpVal;
        }
        
        for (int i = 0; i < A.length; i++) {
        	if (A[i] == val) {
        		count++;
        	}
        }
        
        if (count > A.length / 2) {
        	answer = candidate;
        }

        return answer;
    }

}
