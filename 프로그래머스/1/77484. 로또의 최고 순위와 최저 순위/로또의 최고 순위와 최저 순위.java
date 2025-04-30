class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] wins = {6,6,5,4,3,2,1};
        int correct=0;
        int zero_count=0;
        for(int i=0; i<win_nums.length; i++){
            for(int j=0; j<lottos.length; j++){
                if(win_nums[i]==lottos[j]){
                    correct++;
                }
            }
            if(lottos[i]==0){
                    zero_count++;
                }
        }
        answer[0]=wins[correct+zero_count];
        answer[1]=wins[correct];
        return answer;
    }
}