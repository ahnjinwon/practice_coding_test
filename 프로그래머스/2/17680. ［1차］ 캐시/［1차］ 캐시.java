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
        for(int i=0; i<cities.length; i++){
            boolean bol = false;
            for(String city : queue){
                if(cities[i].equals(city)){
                    answer+=1;
                    int index = queue.indexOf(city);
                    queue.remove(index);
                    queue.add(city);
                    bol=true;
                    break;
                }
            }
            if(bol == false){
                if(queue.size()<cacheSize){
                    answer+=5;
                    queue.add(cities[i]);
                }else{
                    answer+=5;
                    queue.remove(0);
                    queue.add(cities[i]);
                }
            }
        }
        return answer;
    }
}