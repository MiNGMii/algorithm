
class Fibonacci {

	public long fibonacci(int num) {

		long[] arr = new long[num + 1];

		for (int i = 0; i < 2; i++)
			arr[i] = i;

		for (int i = 2; i <= num; i++)
			arr[i] = arr[i - 1] + arr[i - 2];

		return arr[num];
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}
