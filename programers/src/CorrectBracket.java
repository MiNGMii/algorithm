
public class CorrectBracket {

	boolean solution(String s) {
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == '(')
				sum++;
			else if (s.charAt(i) == ')') {
				
				if (sum <= 0)
					return false;
				else
					sum--;
			}
				
		}
		
		if (sum == 0)
			return true;
		else
			return false;
	}
}
