
public class BubbleSort {

	public static int sort(int[] a) {
		int sortCount = 0;	// sort 횟수 카운트
		boolean swapped;	// swap되는지 확인
		
		do {
			swapped = false;
			
			// 맨 앞부터 끝까지 확인하는 1회전이 끝나면 다시 맨 앞부터 확인한다.
			for (int i = 0; i < a.length - 1; i++) {
				
				// 뒤의 숫자보다 앞의 숫자가 클 때 교환이 일어난다.
				if (a[i] > a[i + 1]) {
					a[i] = a[i] + a[i + 1];
					a[i + 1] = a[i] - a[i + 1];
					a[i] = a[i] - a[i + 1];
					
					swapped = true;
					sortCount++;
				}
			}
			
		} while (swapped);	// 처음부터 끝까지 swap되지 않을 때까지 반복
							// (처음부터 끝까지 정렬되어있을 때까지)
		return sortCount;
	}

}
