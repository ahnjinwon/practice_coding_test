import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuffer str = new StringBuffer();
        int Lhand=10;
        int Rhand=12;
        int Llen=0;
        int Rlen=0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                str.append("L");
                Lhand=numbers[i];
            }else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9){
                str.append("R");
                Rhand=numbers[i];
            }else{
                if(numbers[i]==0){
                    numbers[i]=11;
                }
                if(Lhand%3==2){
                    Llen=(Math.max(Lhand,numbers[i])-Math.min(Lhand,numbers[i]))/3;
                }else{
                    Llen=(Math.max((Lhand+1),numbers[i])-Math.min((Lhand+1),numbers[i]))/3+1;
                }
                if(Rhand%3==2){
                    Rlen=(Math.max(Rhand,numbers[i])-Math.min(Rhand,numbers[i]))/3;
                }else{
                    Rlen=(Math.max((Rhand-1),numbers[i])-Math.min((Rhand-1),numbers[i]))/3+1;
                }  
                System.out.println("L: "+Llen+"R: "+Rlen);
                if(Llen<Rlen){
                    str.append("L");
                    Lhand=numbers[i];
                }else if(Llen>Rlen){
                    str.append("R");
                    Rhand=numbers[i];
                }else{
                    if(hand.equals("left")){
                        str.append("L");
                        Lhand=numbers[i];
                    }else if(hand.equals("right")){
                        str.append("R");
                        Rhand=numbers[i];
                    }
                }
            }
        }
        answer=str.toString();
        return answer;
    }
}