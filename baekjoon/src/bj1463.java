import java.util.Scanner;

public class bj1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("X = ");
		int x = sc.nextInt();
		
		int[] cnt = new int[x + 1];
		
		// x�� 1�̰ų� 0�� ��� ������ ���� 0���̹Ƿ� 2���� ����
		for (int i = 2; i <= x; i++) {
			cnt[i] = cnt[i-1]+1;

            if(i % 2 == 0 && cnt[i] > cnt[i / 2] + 1)
            	cnt[i] = cnt[i / 2] + 1;

            if(i % 3 == 0 && cnt[i] > cnt[i/3] + 1)
                cnt[i] = cnt[i / 3] + 1;

        }
		
		sc.close();
		
		System.out.println(cnt[x]);
		
	}

}
