class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        Boolean result = true;
        String s = Long.toString(n,k);
        String[] arr = s.split("0+");
        for(String string : arr){
            if(!string.equals("1")){
                Long number = Long.parseLong(string);
                for(int i=2; i<=Math.sqrt(number); i++){
                    if(number%i==0){
                        result=false;
                        break;
                    }
                }
                if(result==true){
                    answer+=1;
                }
                result=true;
            }
        }
        return answer;
    }
}