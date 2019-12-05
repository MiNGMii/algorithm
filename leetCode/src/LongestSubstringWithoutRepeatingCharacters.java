import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		String A = "abcabcbb";
		String B = "bbbbb";
		String C = "pwwkew";
		String D = " ";
		String E = "aab";
		System.out.println(l.lengthOfLongestSubstring(A));
		System.out.println(l.lengthOfLongestSubstring(B));
		System.out.println(l.lengthOfLongestSubstring(C));
		System.out.println(l.lengthOfLongestSubstring(D));
		System.out.println(l.lengthOfLongestSubstring(E));
	}
	
	public int lengthOfLongestSubstring(String s) {
		int answer = 0;
		String tmp = "";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (tmp.contains("" + c)) {
				tmp = tmp.substring(1);
				i--;
			} else {
				tmp += c;
				if (answer < tmp.length())
					answer = tmp.length();
			}
		}
		
        return answer;
    }
}
