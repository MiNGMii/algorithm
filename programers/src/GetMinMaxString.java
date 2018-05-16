
public class GetMinMaxString {

	public String getMinMaxString(String str) {

		String[] arr = str.split(" ");

		int max = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[0]);
		
		for (int i = 1; i < arr.length; i++) {
			
			int temp = Integer.parseInt(arr[i]);
			
			if (max < temp)	max = temp;
			if (min > temp)	min = temp;
		}

		return min + " " + max;
	}

	public static void main(String[] args) {
		String str = "1 2 3 4";
		GetMinMaxString minMax = new GetMinMaxString();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
	}
}