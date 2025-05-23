import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        int term_cnt = 0;
        int privacies_cnt = 0;
        
        String[] t_date = today.split("\\.");
        int today_cnt = Integer.parseInt(t_date[0]) * 12 * 28
                        + Integer.parseInt(t_date[1]) * 28
                        + Integer.parseInt(t_date[2]);
        
        for(int i=0; i<privacies.length; i++){
            String[] privacy = privacies[i].split(" ");
            String[] p_date = privacy[0].split("\\.");
            
            privacies_cnt = Integer.parseInt(p_date[0]) * 12 * 28
                            + Integer.parseInt(p_date[1]) * 28
                            + Integer.parseInt(p_date[2]);
            
            term_cnt = today_cnt - privacies_cnt;
            
            for(int j=0; j<terms.length; j++){
                String[] term = terms[j].split(" ");
                if(term[0].equals(privacy[1]) && Integer.parseInt(term[1])*28<=term_cnt){
                    answer.add(i+1);
                }
            }
        }
        int[] ans = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            ans[i] = answer.get(i);
        }
        return ans;
    }
}