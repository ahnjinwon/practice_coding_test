import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        ArrayList<Character> arr = new ArrayList<>();
        for(int i=0; i<new_id.length(); i++){
            arr.add(new_id.charAt(i));
        }
        //1
        for(int i=0; i<arr.size(); i++){
            arr.set(i, Character.toLowerCase(arr.get(i)));
        }
        //2
        for(int i = arr.size() - 1; i >= 0; i--) {
            char c = arr.get(i);
            if (!( (c >= 'a' && c <= 'z') ||
                   (c >= '0' && c <= '9') ||
                   c == '-' || c == '_' || c == '.')) {
                arr.remove(i);
            }
        }
        //3
        int size=arr.size();
        for(int i=size-1; i>=0; i--){
            if(arr.get(i)=='.' && i>0){
                if(arr.get(i-1)=='.'){
                    arr.remove(i);
                }
            }
            size=arr.size();
        }
        //4
        while(true){
            if(arr.size()==0){
                break;
            }
            if(arr.get(0)=='.'){
                arr.remove(0);
            }else if(arr.get(arr.size()-1)=='.'){
                arr.remove(arr.size()-1);
            }else{
                break;
            }
        }
        //5
        if(arr.size()==0){
            arr.add('a');
        }
        //6
        if(arr.size()>=16){
            while(arr.size()>=16){
                arr.remove(arr.size()-1);
            }
        }
        while(true){
            if(arr.get(arr.size()-1)=='.'){
                arr.remove(arr.size()-1);
            }else{
                break;
            }
        }
        //7
        while(arr.size()<3){
            if(arr.size()<=2){
                arr.add(arr.get(arr.size()-1));
            }
        }
        
        
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
            answer+=arr.get(i);
        }

        return answer;
    }
}