import java.util.HashMap;

class TryHelloWorld5 {
	
	public int chooseCity(int n, int[][] city) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < city.length; i++) {
			int temp = city[i][0];
			int leng = 0;
			
			for (int j = 0; j < city.length; j++) {
				leng += Math.abs((city[j][0] - temp) * city[j][1]);
			}
			
			map.put(temp, leng);
		}
		
		int min = map.get(city[0][0]);
		int answer = city[0][0];
		
		for (int i = 1; i < city.length; i++) {
			
			if (min > map.get(city[i][0])) {
				min = map.get(city[i][0]);
				answer = city[i][0];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		TryHelloWorld5 test = new TryHelloWorld5();
		int tn = 3;
		int[][] tcity = { { -1, 5 }, { 2, 2 }, { -3, 3 } };
		System.out.println(test.chooseCity(tn, tcity));
	}
}