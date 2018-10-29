
public class SteelStick {

	public static void main(String[] args) {
		System.out.println(solution("()(((()())(())()))(())"));
	}
	
	public static int solution(String arrangement) {
        int answer = 0;
        int steel = 0;
        arrangement = arrangement.replace("()", "|");
        
        for (int i = 0; i < arrangement.length(); i++) {
        	
        	switch (arrangement.charAt(i)) {
        		case '(' 	: steel++; answer++; break;
        		case ')' 	: steel--; break;
        		default		: answer += steel; break;
        	}
        }
        
        return answer;
    }
}
