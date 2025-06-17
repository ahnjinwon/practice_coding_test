import java.util.*;
class Solution {
    public int[] solution(String s) {
        Set<String> set = new LinkedHashSet<>();
        String[] str = s.split("},");
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceAll("[{}]", "");
        }
        Arrays.sort(str, Comparator.comparingInt(String::length));
        for (int i=0; i<str.length; i++) {
            String[] str2 = str[i].split(",");
            for(int j=0; j<str2.length; j++){
                set.add(str2[j]);
            }
        }
        List<String> list = new ArrayList<>(set);
        int[] answer = new int[set.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = Integer.parseInt(list.get(i));
        }
        return answer;
    }
}