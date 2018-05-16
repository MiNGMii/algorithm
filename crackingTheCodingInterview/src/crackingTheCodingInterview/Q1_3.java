package crackingTheCodingInterview;

public class Q1_3 {

	public static void main(String[] args) {
		// URLify
		// 문자열의 모든 공백을 '%20'으로 바꾸는 메서드 작성
		// 모든 문자를 담을 만큼 충분한 공간이 이미 확보됨
		// 문자열의 최종 길이가 함께 주어짐
		
		// 입력: "Mr John Smith", 13
		// 출력: "Mr%20John%20Smith"
		
		String input = "";
		int length = 0;
		
		// Test code
		/*input = "Hello world!";
		length = 12;*/
		/*input = "Mr John Smith";
		length = 13;*/
		/*input = "He who spares the rod hates his son, but he who loves him is careful to discipline him.";
		length = 87;*/
		
		System.out.println(urlify(input, length));
	}
	
	static String urlify(String input, int length) {
		
		char[] arr = new char[length];
		
		for (int i = 0; i < length; i++)
			arr[i] = input.charAt(i);
		
		String output = "";
		
		for (int i = 0; i < length; i++) {
			
			if (arr[i] == ' ') {
				output += "%20";
				continue;
			}
			
			output += arr[i];
		}
		
		return output;
	}
	
}
