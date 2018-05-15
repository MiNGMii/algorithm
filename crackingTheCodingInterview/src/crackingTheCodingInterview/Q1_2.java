package crackingTheCodingInterview;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_2 {
	
	public static void main(String[] args) {
		// 순열 확인
		// 문자열 두 개가 주어졌을 때 서로 순열 관계인지 확인
		
		Scanner sc = new Scanner(System.in);
		
		// 두 개의 문자열을 문자 배열로 입력받아 정렬
		System.out.print("입력1> ");
		char[] input1 = sc.next().toCharArray();
		Arrays.sort(input1);
		
		System.out.print("입력2> ");
		char[] input2 = sc.next().toCharArray();
		Arrays.sort(input2);
		
		// 배열이 서로 같은지 비교
		if (Arrays.equals(input1, input2))
			System.out.println("순열입니다.");
		else
			System.out.println("순열이 아닙니다.");
		
		sc.close();
		
	}
	
}
