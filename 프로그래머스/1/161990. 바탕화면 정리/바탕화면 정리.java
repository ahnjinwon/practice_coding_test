import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for(int i=0; i<wallpaper.length; i++){
            char[] arr = new char[wallpaper[i].length()];
            int cnt = 0;
            for(int j=0; j<wallpaper[i].length(); j++){
                arr[j]=wallpaper[i].charAt(j);
                if(arr[j]=='#'){
                    x.add(i);
                    y.add(j);
                }
            }
        }
        Collections.sort(x);
        Collections.sort(y);
        answer[0]=x.get(0);
        answer[1]=y.get(0);
        answer[2]=x.get(x.size()-1)+1;
        answer[3]=y.get(y.size()-1)+1;
        return answer;
    }
}