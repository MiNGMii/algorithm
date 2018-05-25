import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bj10828 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> stack = new ArrayList<Integer>();
		
		int index = -1;
		int top = 0;
		
		for (int i = 0; i < n; i++) {
			String temp = sc.next();
				
			switch (temp) {
				case "push":
					top = sc.nextInt();
					stack.add(top);
					index++;
					break;
					
				case "pop":
					if (stack.size() > 0) {
						System.out.println(stack.get(index));
						stack.remove(index);
						index--;
					} else {
						System.out.println(-1);
					}
					break;
					
				case "size":
					System.out.println(stack.size());
					break;
					
				case "empty":
					if (stack.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
					
				case "top":
					if (stack.size() > 0)
						System.out.println(stack.get(index));
					else
						System.out.println(-1);
					break;
			}
			
		}
		
		sc.close();
	}
}
