import java.util.Scanner;
import java.util.Stack;

public class bj9012 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Stack<Integer> stack = new Stack<Integer>();
			boolean isCorrect = true;
			
			String temp = sc.next();
			stack.empty();
			
			for (int j = 0; j < temp.length(); j++) {
				
				if (temp.charAt(j) == '(') {
					stack.push(1);
				} else {
					
					if (stack.isEmpty()) {
						isCorrect = false;
						continue;
					} else {
						stack.pop();
					}
				}
			}
			
			if (!stack.isEmpty())	isCorrect = false;
			
			if (isCorrect)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
		sc.close();
	}
}
