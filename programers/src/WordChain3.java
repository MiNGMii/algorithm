import java.util.Arrays;
import java.util.HashMap;

public class WordChain3 {
	
	public static void main(String[] args) {
		String[] A = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		String[] B = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		String[] C = {"hello", "one", "even", "never", "now", "world", "draw"};
		System.out.println(Arrays.toString(solution(3, A)));
		System.out.println(Arrays.toString(solution(5, B)));
		System.out.println(Arrays.toString(solution(2, C)));
	}
	
	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        HashMap<String, Integer> contains = new HashMap<String, Integer>();
        contains.put(words[0], 1);
        
        int pos = 1;
        int[] turn = new int[n];
        turn[0]++;
        
        for (int i = 1; i < words.length; i++) {
        	
        	turn[pos]++;

        	if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0) || contains.get(words[i]) != null) {
        		answer[0] = pos + 1;
        		answer[1] = turn[pos];
        		break;
        	}
        	
        	contains.put(words[i], 1);
        	
        	pos++;
        	if (pos >= n) pos = 0;
        	
        }
        
        return answer;
    }
}