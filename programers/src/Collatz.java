
class Collatz {
	
	public int collatz(int num) {
		int answer = 0;
		
		while (num > 1) {
			
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = (num * 3) + 1;
			}
			
			answer++;
			/*System.out.println(num);*/
			if (num == 1)	return answer;
			if (answer >= 500) break;
		}
		
		return -1;

	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}
