import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        boolean state=true;
        String[] skills = skill.split("");
        for(String i : skill_trees){
            String[] skill_tree = i.split("");
            int idx=0;
            for(String j : skill_tree){
                if(Arrays.asList(skills).contains(j)){
                    if(skills[idx].equals(j)){
                        idx++;
                    }else{
                        state=false;
                    }
                }
                if(!state){
                    break;
                }
            }
            if(!state){
                state=true;
            }else{
                answer++;
            }
        }
        return answer;
    }
}