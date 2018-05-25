
public class RowMethod {

	public String solution(String s) {
		String[] arr = s.split(" ");
		String answer = "";
		
		for (int i = 0; i < arr.length; i++) {
			String[] temp = arr[i].split("");
			
			for (int j = 0; j < temp.length; j++) {
				
				if (j % 2 == 0)
					answer += temp[j].toUpperCase();
				else
					answer += temp[j].toLowerCase();
			}
			
			answer += " ";
		}
		
		return answer.substring(0, answer.length() - 1);
	}
}
