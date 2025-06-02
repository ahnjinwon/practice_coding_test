import java.util.*;
class Solution {
    public int solution(String s) {      
        Map<Character, Character> map = new HashMap();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        int answer = 0;
        int size = s.length();
        for(int i=0; i<size; i++){
            String str = s.substring(i)+s.substring(0,i);
            Stack<Character> stack = new Stack<>();
            boolean state = true;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='(' || str.charAt(j)=='{' || str.charAt(j)=='['){
                    stack.push(str.charAt(j));
                }else{
                    if(stack.isEmpty() || stack.peek() != map.get(str.charAt(j))){
                        state=false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(state && stack.isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}