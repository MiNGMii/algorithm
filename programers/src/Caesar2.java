
class Caesar2 {
	
	String caesar(String s, int n) {
		String result = "";
		char[] input = s.toCharArray();
		
		for (int i = 0; i < input.length; i++) {
			
			if (input[i] >= 'A' && input[i] <= 'Z')
                input[i] = (char) ('A' + (input[i] - 'A' + n) % 26);
            
			else if (input[i] >= 'a' && input[i] <= 'z')
            	input[i] = (char) ('a' + (input[i] - 'a' + n) % 26);
		}
		
		for (int i = 0; i < input.length; i++) {
			result += input[i];
		}

		return result;
	}

	public static void main(String[] args) {
		Caesar2 c = new Caesar2();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}
}
