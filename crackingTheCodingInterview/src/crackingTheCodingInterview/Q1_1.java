package crackingTheCodingInterview;

import java.util.HashMap;
import java.util.Scanner;

public class Q1_1 {

	public static void main(String[] args) {
		// 중복이 없는가
		// 문자열이 주어졌을 때 같은 문자가 중복 등장하는지 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력> ");
		String str = sc.next();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		boolean isDuple = true;
		
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			
			if (map.get(key) != null) {
				System.out.println("중복 문자가 존재합니다.");
				isDuple = false;
				break;
			} else {
				map.put(key, 1);
			}
			
		}
		
		if (isDuple) System.out.println("중복 문자가 없습니다.");
		
		sc.close();
		
	}

}
