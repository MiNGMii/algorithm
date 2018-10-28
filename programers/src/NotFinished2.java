import java.util.HashMap;

public class NotFinished2 {
		
	public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String answer = "";
        
        for (int i = 0; i < completion.length; i++) {
        	if (map.containsKey(completion[i]))
        		map.replace(completion[i], map.get(completion[i]) + 1);
        	else
        		map.put(completion[i], 1);
        }
        
        for (int i = 0; i < participant.length; i++) {
        	if (map.containsKey(participant[i])) {
        		if (map.get(participant[i]) > 1)
        			map.replace(participant[i], map.get(participant[i]) - 1);
        		else
        			map.remove(participant[i]);
        	} else {
        		return participant[i];
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		NotFinished solutions = new NotFinished();
		String[] A = {"leo", "kiki", "eden"};
		String[] B = {"eden", "kiki"};
		System.out.println(solutions.solution(A, B));
		String[] C = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] D = {"josipa", "filipa", "marina", "nikola"};
		System.out.println(solutions.solution(C, D));
	}
}
