import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] A =  {2,7,11,15};
		System.out.println(Arrays.toString(twoSum.twoSum(A, 9)));
	}
	
	public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
        	final int temp = target - nums[i];
            if (Arrays.stream(nums).anyMatch(x -> x == temp)) {
            	list.add(i);
            }
                
        }
        
        if (list.size() == 2) {
            answer[0] = list.get(0);
            answer[1] = list.get(1);
        }
        
        return answer;
    }

}
