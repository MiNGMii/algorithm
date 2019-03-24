
public class Dubstep {
	
	public static String SongDecoder(String song) {
		String answer = "";
		String[] words = song.split("WUB");
		
		for (int i = 0; i < words.length; i++)
			if (!words[i].equals(""))	answer += words[i] + " ";
		
		return answer.substring(0, answer.length() - 1);
	}
}
