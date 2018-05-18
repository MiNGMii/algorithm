
class NLCM {
	
	public long nlcm(int[] num) {
		long answer = num[0];
		long small = 0;
		long big = 0;
		
		for (int i = 1; i < num.length; i++) {
			small = Math.min(answer, num[i]);
			big = Math.max(answer, num[i]);
			
			answer = (small * big) / gcd(small, big);
		}
		
		return answer;
	}
	
	public static long gcd(long small, long big) {
		long answer = 0;
		
        for(int i = 1; i <= small; i++){
            
          if(small % i == 0 && big % i == 0) answer = i;
        }
		
		return answer;
	}

	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 2, 6, 8, 14 };
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.nlcm(ex));
	}
}