import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int total = citations.length;
        Arrays.sort(citations);
        
        for(int i=0; i<total; i++){
            if(citations[i]>=(total-i)){
                return total-i;
            }
        }
        
        return answer;
    }
}