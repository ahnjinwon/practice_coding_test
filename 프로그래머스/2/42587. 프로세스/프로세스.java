import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int cnt=0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i=0; i<priorities.length; i++) {
            queue.add(new int[] {i,priorities[i]});
        }
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            boolean bol = false;
            for(int[] process : queue){
                if(process[1]>current[1]){
                    bol=true;
                    break;
                }
            }
            if(bol){
                queue.add(current);
            }else{
                cnt++;
                if(current[0]==location){
                    return cnt;
                }
            }
        }
        return answer;
    }
}