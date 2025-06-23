import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer,Integer> younger = new HashMap<>();
        Set<Integer> older = new HashSet<>();
        for(int i:topping){
            younger.put(i,younger.getOrDefault(i,0)+1);
        }
        for(int i=0; i<topping.length; i++){
            older.add(topping[i]);
            younger.put(topping[i],younger.get(topping[i])-1);
            if(younger.get(topping[i])==0){
                younger.remove(topping[i]);
            }
            if(older.size()==younger.size()){
                answer++;
            }
        }
        return answer;
    }
}