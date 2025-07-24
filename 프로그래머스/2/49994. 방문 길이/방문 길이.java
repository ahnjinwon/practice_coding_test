import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        int[] coor = {0,0};
        for(int i=0; i<dirs.length(); i++){
            char c = dirs.charAt(i);
            String s = coor[0]+","+coor[1];
            switch(c){
                case 'U':
                    if(coor[1]<5){
                        coor[1]+=1;
                    }else{
                        continue;
                    }
                    break;
                case 'D':
                    if(coor[1]>-5){
                        coor[1]-=1;
                    }else{
                        continue;
                    }
                    break;
                case 'R':
                    if(coor[0]<5){
                        coor[0]+=1;
                    }else{
                        continue;
                    }
                    break;
                case 'L':
                    if(coor[0]>-5){
                        coor[0]-=1;
                    }else{
                        continue;
                    }
                    break;
            }
            String rs = coor[0]+","+coor[1]+"->"+s;
            s+="->"+coor[0]+","+coor[1];
            set.add(s);
            set.add(rs);
        }
        
        return set.size()/2;
    }
}