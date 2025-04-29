import java.util.*;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        if(arr.length==1) return arr[0];
        int answer = lcm(arr[0], arr[1]);
        for(int i=2; i<arr.length; i++){
            answer=lcm(answer,arr[i]);
        }
        return answer;
    }
    
    private int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    
    private int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
