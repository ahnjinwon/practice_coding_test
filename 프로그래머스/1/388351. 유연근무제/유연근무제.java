class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int cnt=0;
        for(int i=0; i<schedules.length; i++){
            if(schedules[i]%100>=50 && schedules[i]%100<=59){
                    schedules[i]=schedules[i]+50;
                }else{
                    schedules[i]=schedules[i]+10;
                }
            for(int j=0; j<timelogs[i].length; j++){
                int today=(startday+j)%7;
                if(today==6 || today==0){
                    continue;
                }else{
                    if(schedules[i]>=timelogs[i][j]){
                        cnt++;
                    }
                }
            }
            if(cnt==5){
                answer++;
            }
            cnt=0;
        }
        return answer;
    }
}