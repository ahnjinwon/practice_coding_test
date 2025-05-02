import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        char[] arr_s = s.toCharArray();

        for (int i = 0; i < arr_s.length; i++) {
            int count = 0;
            char c = arr_s[i];
            while (count < index) {
                c = (char) ('a' + (c - 'a' + 1) % 26);
                if (!skipSet.contains(c)) {
                    count++;
                }
            }
            answer.append(c);
        }

        return answer.toString();
    }
}