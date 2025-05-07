import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> minMap = new HashMap<>();
        int[] answer = new int[targets.length];
        
        for(String key : keymap){
            for(int i=0; i<key.length(); i++){
                char c = key.charAt(i);
                int pressCnt = i+1;
                
                if(minMap.containsKey(c)){
                    minMap.put(c,Math.min(minMap.get(c), pressCnt));
                }else{
                    minMap.put(c,pressCnt);
                }
            }
        }
        
        for(int i=0; i<targets.length; i++){
            String target = targets[i];
            int totalCnt = 0;
            for(int j=0; j<target.length(); j++){
                char c = target.charAt(j);
                
                if(minMap.containsKey(c)){
                    totalCnt+=minMap.get(c);
                }else{
                    totalCnt=-1;
                    break;
                }
            }
            answer[i]=totalCnt;
        }
        
        return answer;
    }
}