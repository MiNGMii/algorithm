
class TryHelloWorld4 {
	
	public int nextBigNumber(int n) {
		
		int nBit = Integer.bitCount(n);
		int answer = n;
		
		while (true) {
			answer++;
			
			if (nBit == Integer.bitCount(answer))	break;
		}

		return answer;
	}

	public static void main(String[] args) {
		TryHelloWorld4 test = new TryHelloWorld4();
		int n = 78;
		System.out.println(test.nextBigNumber(n));
	}
}