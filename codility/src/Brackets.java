import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		Brackets b = new Brackets();
		System.out.println(b.solution("{[()()]}")); //1
		System.out.println(b.solution("{[()()]}()")); //1
		System.out.println(b.solution("([)()]")); // 0
	}

	// S consists only of the following characters
	// : "(", "{", "[", "]", "}" and/or ")".
	public int solution(String S) {
        Stack<Integer> st = new Stack<>();
        
        for (char c : S.toCharArray()) {
        	switch(c) {
        		case '(':
        			st.push(1);
        			break;
        		case '{':
        			st.push(2);
        			break;
        		case '[':
        			st.push(3);
        			break;
        		case ')':
        			if (st.size() <= 0) return 0;
        			if (st.pop() != 1) return 0; 
        			break;
        		case '}':
        			if (st.size() <= 0) return 0;
        			if (st.pop() != 2) return 0; 
        			break;
        		case ']':
        			if (st.size() <= 0) return 0;
        			if (st.pop() != 3) return 0; 
        			break;
        	}
        }
        
        if (st.size() > 0) return 0;
        
        return 1;
    }
}
