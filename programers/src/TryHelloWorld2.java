
public class TryHelloWorld2 {

	public String getDayName(int a, int b) {
		
		String[] weeks = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int days = 0;
		
		for (int i = 0; i < a - 1; i++) {
			days += month[i];
		}
		
		days += b;
		
		return weeks[days % 7];
	}

	public static void main(String[] args) {
		TryHelloWorld2 test = new TryHelloWorld2();

		int a = 2;
		for (int b = 1; b < 30; b++)
			System.out.println(test.getDayName(a, b));
	}
}
