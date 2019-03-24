
public class NumberFun {

	public static long findNextSquare(long sq) {
		if (Math.round(Math.sqrt(sq)) == Math.sqrt(sq))
			return (long) Math.pow(Math.sqrt(sq) + 1,2);
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(findNextSquare(121) == 144);
		System.out.println(findNextSquare(625) == 676);
		System.out.println(findNextSquare(114) == -1);
	}
}
