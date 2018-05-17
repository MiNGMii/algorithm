
class StringExercise {

	String getMiddle(String word) {

		int wl = word.length() / 2;

		if (word.length() % 2 == 0)
			return "" + word.charAt(wl - 1) + word.charAt(wl);
		else
			return "" + word.charAt(wl);

		/*return word != null ? word.substring((word.length() - 1) / 2, (word.length() + 2) / 2) : "";*/
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		StringExercise se = new StringExercise();
		System.out.println(se.getMiddle("power"));
	}
}
