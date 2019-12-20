import java.util.Stack;

public class Nesting {

	public static void main(String[] args) {
		Nesting n = new Nesting();
		System.out.println(n.solution("(()(())())") == 1);
		System.out.println(n.solution("())") == 0);
	}
	
	public int solution(String S) {
		Stack<Character> stack = new Stack<>();
		
		for (char c : S.toCharArray()) {
			if (c == '(') {
				stack.add(c);
			} else if (stack.size() == 0 || stack.pop() == c) {
				return 0;
			}
		}
		
		if (stack.size() > 0) return 0;
		
        return 1;
    }

}
