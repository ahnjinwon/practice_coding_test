import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 1;
        int count=0;
        char[] arr = s.toCharArray();
        char x = arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(x==(arr[i])){
                count++;
            }else{
                count--;
            }
            if(count==0){
                answer++;
                x=arr[i+1];
            }
        }
        return answer;
    }
}