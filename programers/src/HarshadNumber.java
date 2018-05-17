
public class HarshadNumber {
	
	public boolean isHarshad(int num) {
		
		String[] input = Integer.toString(num).split("");
		int sum = 0;
		
		for (int i = 0; i < input.length; i++) {
			sum += Integer.parseInt(input[i]);
		}
		
		/*System.out.println(sum);*/
		
		return num % sum == 0;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}
