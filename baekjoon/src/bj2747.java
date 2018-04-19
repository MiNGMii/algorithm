
import java.util.Scanner;

public class bj2747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = sc.nextInt();
		
		int[] pivo = new int[n + 1];
		
		pivo[0] = 0;
		pivo[1] = 1;
		
		for (int i = 2; i < pivo.length; i++)
			pivo[i] = pivo[i - 1] + pivo[i - 2];
		
		System.out.println(pivo[n]);
		
		sc.close();

	}

}
