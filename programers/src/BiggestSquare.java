
public class BiggestSquare {

	public int solution(int[][] board) {
		int max = 0;
		
		for (int i = 1; i < board[0].length; i++) {
			
			for (int j = 1; j < board.length; j++) {
				
				if (board[i][j] != 0)
					board[i][j] += Math.min(board[i - 1][j], Math.min(board[i - 1][j - 1], board[i][j - 1]));
				
				if (max < board[i][j])
					max = board[i][j];
			}
		}
		
		return max * max;
	}
}
