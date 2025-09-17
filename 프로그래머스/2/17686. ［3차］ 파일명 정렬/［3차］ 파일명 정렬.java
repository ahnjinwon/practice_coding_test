import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files,(o1, o2) ->{
            String[] f1 = split(o1);
            String[] f2 = split(o2);
            
            int head = f1[0].toLowerCase().compareTo(f2[0].toLowerCase());
            if(head!=0) return head;
            
            return Integer.parseInt(f1[1]) - Integer.parseInt(f2[1]);
        });
        return files;
    }
    
    private String[] split(String file){
        String head="";
        String number = "";
        int i=0;
        while(i<file.length() && !Character.isDigit(file.charAt(i))){
            head+=file.charAt(i);
            i++;
        }
        while(i<file.length() && Character.isDigit(file.charAt(i)) && number.length()<5){
            number+=file.charAt(i);
            i++;
        }
        return new String[]{head, number};
    }
}