
class Caesar {
	
	String caesar(String s, int n) {
		String result = "";
		char[] input = s.toCharArray();
		
		for (int i = 0; i < input.length; i++) {
			
			if (input[i] == ' ')		continue;
			
			for (int j = 0; j < n; j++) {	
			
				if (input[i] == 'z')		input[i] = 'a';
				else if (input[i] == 'Z')	input[i] = 'A';
				else						input[i] += 1;
			}
		}
		
		for (int i = 0; i < input.length; i++) {
			result += input[i];
		}

		return result;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}
}
