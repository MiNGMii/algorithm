import java.util.Arrays;

public class WordChain2 {
	
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
        
        String[] contains = new String[words.length];
        contains[0] = words[0];
        
        int[] turn = new int[n];
        turn[0]++;
        
        int pos = 1;
        
        for (int i = 1; i < words.length; i++) {
        	
        	turn[pos]++;

        	if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0) || Arrays.asList(contains).contains(words[i])) {
        		answer[0] = pos + 1;
        		answer[1] = turn[pos];
        		break;
        	}
        	
        	contains[i] = words[i];
        	
        	pos++;
        	if (pos >= n) pos = 0;
        	
        }
        
        return answer;
    }
}