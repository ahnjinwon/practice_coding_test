import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        
        for(int i : moves){
            int move=i-1;
            for(int j=0; j<board.length; j++){
                if(board[j][move]!=0){
                    if(!basket.isEmpty() && basket.peek()==board[j][move]){
                        basket.pop();
                        answer+=2;
                    }else{
                        basket.push(board[j][move]);
                    }
                    board[j][move]=0;
                    break;
                }
            }
        }

        return answer;
    }
}