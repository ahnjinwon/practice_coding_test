import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int[] arr = new int[elements.length];
        int len=1;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<elements.length; i++){
            arr[i]=elements[i];
            set.add(arr[i]);
        }
        while(true){
            if(len==elements.length){
                break;
            }
            for(int i=0; i<elements.length; i++){
                arr[i]=arr[i]+elements[(i+len)%elements.length];
                set.add(arr[i]);
            }
            len++;
        }

        return set.size();
    }
}