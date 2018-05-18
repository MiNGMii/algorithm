
public class Expressions {

	public int expressions(int num) {
		int answer = 0;
		
		for (int i = 1; i <= num; i++) {
			int temp = i;
			int inc = i + 1;
			
			/*System.out.println("while 시작");*/
			
			while (temp <= num) {
				/*System.out.println(temp + ", " + inc);*/
				
				if (temp == num) {
					answer++;
					/*System.out.println("answer: " + answer);*/
					break;
				}
				
				temp += inc;
				inc++;
			}
		}
		
		return answer;
	}

	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(expressions.expressions(15));
	}
}
