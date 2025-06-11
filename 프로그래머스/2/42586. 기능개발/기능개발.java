import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=progresses.length-1; i>=0; i--){
            if((100-progresses[i])%speeds[i]==0){
                stack.push((100-progresses[i])/speeds[i]);
            }else{
                stack.push((100-progresses[i])/speeds[i]+1);
            }
        }
        while(!stack.isEmpty()){
            int top = stack.peek();
            int cnt = 0;
            while(!stack.isEmpty() && stack.peek()<=top){
                stack.pop();
                cnt++;
            }
            arr.add(cnt);
        }
        int[] answer = new int[arr.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}