class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String s = "";
        int i=0;
        while(true){
            s += Integer.toString(i,n);
            i++;
            if(s.length()/m>=t){
                break;
            }
        }
        s=s.toUpperCase();
        for(int k=0; k<s.length(); k++){
            if((k%m)==(p-1) && answer.length()<t){
                answer+=s.charAt(k);
            }
        }
        return answer;
    }
}