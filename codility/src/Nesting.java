public class Nesting {

	public static void main(String[] args) {
		Nesting n = new Nesting();
		System.out.println(n.solution("(()(())())") == 1);
		System.out.println(n.solution("())") == 0);
	}
	
	public int solution(String S) {
		int sum = 0;
		
		for (char c : S.toCharArray()) {
			if (c == '(')		sum++;
			else if (sum > 0)	sum--;
			else				return 0;
		}
		
		if (sum > 0) return 0;
		
        return 1;
    }

}
