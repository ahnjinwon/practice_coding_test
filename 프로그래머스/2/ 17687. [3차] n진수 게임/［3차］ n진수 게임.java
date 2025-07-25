class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        String ans="";
        int i=0;
        while(true){
            sb.append(Integer.toString(i, n));
            i++;
            if(sb.length()>t*m){
                break;
            }
        }
        String s = sb.toString().toUpperCase();
        for(int k=0; k<s.length(); k++){
            if((k%m)==(p-1)){
                
                answer.append(s.charAt(k));
                if(answer.length() == t){
                    ans=answer.toString();
                    break;
                }
            }
        }
        return ans;
    }
}
