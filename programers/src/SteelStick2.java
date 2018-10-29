import java.util.Stack;

public class SteelStick2 {

	public static void main(String[] args) {
		System.out.println(solution("()(((()())(())()))(())"));
	}
	
	public static int solution(String arrangement) {
        int answer = 0;
        Stack<Integer> steel = new Stack<Integer>();
        arrangement = arrangement.replace("()", "|");
        
        for (int i = 0; i < arrangement.length(); i++) {
        	
        	switch (arrangement.charAt(i)) {
        		case '(' 	: steel.push(1); answer++; break;
        		case ')' 	: steel.pop(); break;
        		default		: answer += steel.size(); break;
        	}
        }
        
        return answer;
    }
}
