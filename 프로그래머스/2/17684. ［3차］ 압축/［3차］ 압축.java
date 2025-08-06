import java.util.*;
class Solution {
    public int[] solution(String msg) {
        List<Integer> result = new ArrayList<>();
        List<String> dic = new ArrayList<>();
        for(char c='A'; c<='Z'; c++){
            dic.add(String.valueOf(c));
        }
        int i=0;
        while(i<msg.length()){
            String w="";
            int j=i;
            while(j<msg.length() && dic.contains(msg.substring(i,j+1))){
                w=msg.substring(i,j+1);
                j++;
            }
            
            result.add(dic.indexOf(w)+1);
            
            if(j<msg.length()){
                String wc = msg.substring(i,j+1);
                dic.add(wc);
            }
            
            i+=w.length();
            
        }
        int[] answer = new int[result.size()];
        for(int k=0; k<result.size(); k++){
            answer[k]=result.get(k);
        }
        return answer;
    }
}