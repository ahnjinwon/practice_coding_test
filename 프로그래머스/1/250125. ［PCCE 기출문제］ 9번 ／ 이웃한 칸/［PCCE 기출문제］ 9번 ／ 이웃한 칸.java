class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        System.out.println(color);
        int[][] inc = {{0,1,-1,0},{1,0,0,-1}};
        for(int j=0; j<4; j++){
            try{
                if(board[h+inc[0][j]][w+inc[1][j]].equals(color)){
                answer++;
                }
            }catch(Exception e){
                continue;
            }
        }
        return answer;
    }
}