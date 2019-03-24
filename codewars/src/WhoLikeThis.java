
public class WhoLikeThis {

	public static String whoLikesIt(String... names) {
        String answer = "";
        int len = names.length;
        
        switch (len) {
        	case 0 : return "no one likes this";
        	case 1 : return names[0] + " likes this";
        	case 2 : answer += names[0] + " and " + names[1]; break;
        	case 3 : answer += names[0] + ", " + names[1] + " and " + names[2]; break;
        	default: answer += names[0] + ", " + names[1] + " and " + (len-2) + " others";
        }
        return answer + " like this";
    }
	
	public static void main(String[] args) {
		String[] A = {};
		String[] B = {"Peter"};
		String[] C = {"Jacob", "Alex"};
		String[] D = {"Max", "John", "Mark"};
		String[] E = {"Alex", "Jacob", "Mark", "Max"};
		System.out.println(whoLikesIt(A));
		System.out.println(whoLikesIt(B));
		System.out.println(whoLikesIt(C));
		System.out.println(whoLikesIt(D));
		System.out.println(whoLikesIt(E));
	}
}
