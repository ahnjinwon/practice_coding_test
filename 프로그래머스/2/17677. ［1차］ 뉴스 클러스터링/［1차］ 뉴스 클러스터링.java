import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase().replaceAll("[^A-Z]", " ");
        str2 = str2.toUpperCase().replaceAll("[^A-Z]", " ");
        
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();  
        
        for(int i=0; i < str1.length()-1; i++){
            String s = str1.substring(i, i+2);
            if(!s.contains(" ")) arr1.add(s);
        }
        for(int i=0; i < str2.length()-1; i++){
            String s = str2.substring(i, i+2);
            if(!s.contains(" ")) arr2.add(s);
        }
        
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        for(String s:arr1){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
        for(String s:arr2){
            map2.put(s,map2.getOrDefault(s,0)+1);
        }
        
        int intersize=0;
        int unionsize=0;
        
        Set<String> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());
        
        for(String key:keys){
            int cnt1 = map1.getOrDefault(key,0);
            int cnt2 = map2.getOrDefault(key,0);
            
            intersize += Math.min(cnt1,cnt2);
            unionsize += Math.max(cnt1,cnt2);
        }
        
        if(unionsize==0){
            return 65536;
        }
        
        double result = ((double)intersize/unionsize)*65536;
        return (int)result;
    }
}