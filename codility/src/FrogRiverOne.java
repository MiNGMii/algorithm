import java.util.HashMap;

public class FrogRiverOne {
    
    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(5, A));
    }
    
    public static int solution(int X, int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < A.length; i++) {
            
            if (A[i] <= X && map.get(A[i]) == null)
                map.put(A[i], 1);
            
            if (map.size() == X) {
                return i;
            }
        }
        
        return -1;
    }
}
