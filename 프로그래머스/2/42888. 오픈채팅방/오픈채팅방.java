import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String, String> id = new HashMap<>();
        for(int i=0; i<record.length; i++){
            String[] split = record[i].split(" ");
            if(split[0].equals("Leave")){
                continue;
            }else{
                id.put(split[1],split[2]);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<record.length; i++){
            String[] split = record[i].split(" ");
            if(split[0].equals("Enter")){
                list.add(id.get(split[1])+"님이 들어왔습니다.");
            }else if(split[0].equals("Leave")){
                list.add(id.get(split[1])+"님이 나갔습니다.");
            }
        }
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}