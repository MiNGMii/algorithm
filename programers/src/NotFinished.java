import java.util.Arrays;

public class NotFinished {
	
	public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        //System.out.println(Arrays.toString(participant));
        //System.out.println(Arrays.toString(completion));
        
        for (int i = 0; i < completion.length; i++) {
        	if (!participant[i].equals(completion[i]))
        		return participant[i];
        }
        
        return participant[participant.length - 1];
    }
	
	public static void main(String[] args) {
		NotFinished solutions = new NotFinished();
		String[] A = {"leo", "kiki", "eden"};
		String[] B = {"eden", "kiki"};
		System.out.println(solutions.solution(A, B));
		String[] C = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] D = {"josipa", "filipa", "marina", "nikola"};
		System.out.println(solutions.solution(C, D));
		String[] E = {"mislav", "stanko", "mislav", "ana"};
		String[] F = {"stanko", "ana", "mislav"};
		System.out.println(solutions.solution(E, F));
	}
}
