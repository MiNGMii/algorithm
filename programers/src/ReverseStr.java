import java.util.Arrays;
import java.util.Collections;

public class ReverseStr {
	
	public String reverseStr(String str){
		
		String[] arr = str.split("");
		Arrays.sort(arr, Collections.reverseOrder());
		
		return String.join("", arr);
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println(rs.reverseStr("Zbcdefg"));
	}
}
