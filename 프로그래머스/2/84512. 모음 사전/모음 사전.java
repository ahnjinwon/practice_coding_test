class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] dic={781,156,31,6,1};
        String str = "AEIOU";
        
        for(int i=0; i<word.length(); i++){
            int index=str.indexOf(word.charAt(i));
            answer+=index*dic[i]+1;
        }
        return answer;
    }
}