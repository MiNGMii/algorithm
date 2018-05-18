
class JumpCase {

	public int jumpCase(int num) {
		int answer = 0;
		int[] count = new int[num];
		
		if (num == 1 || num == 2)	return num;
		
		count[0] = 1;
		count[1] = 2;
		
		for (int i = 2; i < num; i++) {
			count[i] = count[i - 1] + count[i - 2];
		}
		
		return count[num - 1];
	}

	public static void main(String[] args) {
		JumpCase c = new JumpCase();
		int testCase = 13;
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.jumpCase(testCase));
	}
}
