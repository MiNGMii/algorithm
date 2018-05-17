
public class PrintTriangle2 {
	
	public String printTriangle(int num){
		
		String answer = "";
		String star = "*";
		
		for (int i = 1; i <= num; i++) {
			answer += star + "\n";
			star += "*";
		}
			
		return answer;		
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		PrintTriangle2 pt = new PrintTriangle2();
		System.out.println( pt.printTriangle(5) );
	}
}
