import java.util.Scanner;

public class bj4149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n = ");
		long n = sc.nextLong();
		
		while (n > 1) {
			
			for (int i = 2; i <= n; i++) {
				
				if (n % i == 0) {
					System.out.println(i);
					n = n / i;
					
					break;
				}
			}
		}
		
		sc.close();
	}

}
