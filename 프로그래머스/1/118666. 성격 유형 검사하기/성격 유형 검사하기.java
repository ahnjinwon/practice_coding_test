class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] result = new int[4];
        for(int i=0; i<choices.length; i++){
            if(survey[i].charAt(0)=='R'){
                result[0]+=4-choices[i];
            }else if(survey[i].charAt(0)=='T'){
                result[0]+=-4+choices[i];
            }
            
            if(survey[i].charAt(0)=='C'){
                result[1]+=4-choices[i];
            }else if(survey[i].charAt(0)=='F'){
                result[1]+=-4+choices[i];
            }
            
            if(survey[i].charAt(0)=='J'){
                result[2]+=4-choices[i];
            }else if(survey[i].charAt(0)=='M'){
                result[2]+=-4+choices[i];
            }
            
            if(survey[i].charAt(0)=='A'){
                result[3]+=4-choices[i];
            }else if(survey[i].charAt(0)=='N'){
                result[3]+=-4+choices[i];
            }
        }
        if(result[0]>=0){
            answer+="R";
        }else{
            answer+="T";
        }
        if(result[1]>=0){
            answer+="C";
        }else{
            answer+="F";
        }
        if(result[2]>=0){
            answer+="J";
        }else{
            answer+="M";
        }
        if(result[3]>=0){
            answer+="A";
        }else{
            answer+="N";
        }
        return answer;
    }
}