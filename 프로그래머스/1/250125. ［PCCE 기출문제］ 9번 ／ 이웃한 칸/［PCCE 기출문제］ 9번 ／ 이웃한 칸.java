class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        int[][] inc = {{0, 1, -1, 0}, {1, 0, 0, -1}};
        
        for (int j = 0; j < 4; j++) {
            int nh = h + inc[0][j];
            int nw = w + inc[1][j];
            
            if (nh >= 0 && nh < board[0].length && nw >= 0 && nw < board[0].length) {
                if (board[nh][nw].equals(color)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}