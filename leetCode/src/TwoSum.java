import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] A =  {2,7,11,15};
		int[] B =  {3,2,4};
		int[] C =  {3,3};
		System.out.println(Arrays.toString(twoSum.twoSum(A, 9)));
		System.out.println(Arrays.toString(twoSum.twoSum(B, 6)));
		System.out.println(Arrays.toString(twoSum.twoSum(C, 6)));
	}
	
	public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
        	for (int j = 0; j < nums.length; j++) {
        		if (i == j) continue;
        		if (nums[i] + nums[j] == target) {
        			answer[0] = i;
        			answer[1] = j;
        			return answer;
        		}
        	}
        }
        
        return answer;
    }

}
