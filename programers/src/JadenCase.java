
public class JadenCase {

	public String solution(String s) {
		String answer = "";
		String[] arr = s.split("");
		boolean change = true;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i].equals(" ")) {
				change = true;
				answer += arr[i];
				continue;
			}
			
			if (change) {
				arr[i] = arr[i].toUpperCase();
				change = false;
			} else {
				arr[i] = arr[i].toLowerCase();
			}
			
			answer += arr[i];
		}
		
		return answer;
	}
}
