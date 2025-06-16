import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> queue = new ArrayList<>();
        if(cacheSize==0){
            return cities.length*5;
        }
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        }
        for(String city : cities){
            int index = queue.indexOf(city);
            if(index==-1){
                answer+=5;
                if(queue.size()>=cacheSize){
                    queue.remove(0);
                }
                queue.add(city);
            }else{
                answer+=1;
                queue.remove(index);
                queue.add(city);
            }
        }
        return answer;
    }
}