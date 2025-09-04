import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> in = new HashMap<>();
        Map<String, Integer> total = new TreeMap<>();
        for(String str : records){
            String[] record = str.split(" ");
            int time = toMinutes(record[0]);
            String carnum = record[1];
            String type = record[2];
            
            if(record[2].equals("IN")){
                in.put(carnum,time);
            }else{
                int intime = in.remove(carnum);
                total.merge(carnum,time-intime,Integer::sum);
            }
        }
        
        int end = toMinutes("23:59");
        for(Map.Entry<String, Integer> e : in.entrySet()){
            String carnum = e.getKey();
            int intime = e.getValue();
            total.merge(carnum,end-intime,Integer::sum);
        }
        
        int[] answer = new int[total.size()];
        int idx=0;
        for(int time : total.values()){
            if((time-fees[0])>0){
                answer[idx] = fees[1] + (int)Math.ceil((double)(time - fees[0]) / fees[2]) * fees[3];
            }else{
                answer[idx] = fees[1];
            }
            idx++;
        }
        
        return answer;
    }
    private static int toMinutes(String hhmm) {
        String[] p = hhmm.split(":");
        return Integer.parseInt(p[0]) * 60 + Integer.parseInt(p[1]);
    }
}