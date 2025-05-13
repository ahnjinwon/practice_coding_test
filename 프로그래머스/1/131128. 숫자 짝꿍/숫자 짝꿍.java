class Solution {
    public String solution(String X, String Y) {
        int[] numX = new int[10];
        int[] numY = new int[10];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<X.length(); i++){
            numX[X.charAt(i)-'0']++;
        }
        for(int i=0; i<Y.length(); i++){
            numY[Y.charAt(i)-'0']++;
        }
        for(int i=numX.length-1; i>=0; i--){
            if(numX[i]>0&&numY[i]>0){
                for(int j=0; j<Math.min(numX[i],numY[i]); j++){
                    sb.append(i);
                }
            }
        }
        String answer=sb.toString();
        if(answer.equals("")){
            answer="-1";
        }
        if(answer.matches("0+")){
            answer="0";
        }
        return answer;
    }
}