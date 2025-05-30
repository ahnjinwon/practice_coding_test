import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wmap = new HashMap<>();
        int answer = 0;
        boolean val = false;
        for(int i=0; i<want.length; i++){
            wmap.put(want[i],number[i]);
        }
        for(int i=0; i<=discount.length - 10; i++){
            Map<String, Integer> temp = new HashMap<>();
            temp.putAll(wmap);
            if(temp.containsKey(discount[i])){
                for(int j=i; j<i+10; j++){
                    if(temp.containsKey(discount[j])){
                        temp.put(discount[j],temp.get(discount[j])-1);
                    }
                }
                val=true;
                for(int cnt : temp.values()){
                    if(cnt>0){
                        val = false;
                        break;
                    }
                }
            }
            if(val){
                answer++;
            }
        }
        return answer;
    }
}