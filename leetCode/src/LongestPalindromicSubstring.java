import java.util.HashSet;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		LongestPalindromicSubstring s = new LongestPalindromicSubstring();
		System.out.println(s.longestPalindrome("babad"));
		System.out.println(s.longestPalindrome("cbbd"));
		System.out.println(s.longestPalindrome("a"));
		System.out.println(s.longestPalindrome("abcda"));
	}
	
    public String longestPalindrome(String s) {
    	if (s.length() <= 1) return s;
    	
    	String answer = "";
    	String tmpSubstr = "";
    	int length =  0;
    	int cnt = 0;
    	String tmp = ""; 
    	
    	for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (tmp.contains("" + c)) {
				tmp = tmp.substring(1);
				i--;
			} else {
				tmp += c;
				if (answer.length() < tmp.length())
					answer = tmp;
			}
		}
    	
        return answer;
    }

}
