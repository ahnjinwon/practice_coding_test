import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for(int i=1; i<=n; i++){
            map.put(i,1);
        }

        for(int i=0; i<lost.length; i++){
            map.put(lost[i],map.get(lost[i])-1);
        }
        
        for(int i=0; i<reserve.length; i++){
            map.put(reserve[i],map.get(reserve[i])+1);
        }
        
        for (int i = 1; i <= n; i++) {
            if (map.get(i) == 2) {
                if (i > 1 && map.get(i - 1) == 0) {
                    map.put(i - 1, 1);
                    map.put(i, 1);
                } else if (i < n && map.get(i + 1) == 0) {
                    map.put(i + 1, 1);
                    map.put(i, 1);
                }
            }
        }
            
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>=1){
                answer++;
            }
        }
        
        return answer;
    }
}
