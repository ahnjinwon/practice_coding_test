import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        int answer = 0;

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> countMap = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                countMap.put(discount[j], countMap.getOrDefault(discount[j], 0) + 1);
            }

            boolean matched = true;
            for (String item : wantMap.keySet()) {
                if (countMap.getOrDefault(item, 0) < wantMap.get(item)) {
                    matched = false;
                    break;
                }
            }

            if (matched) {
                answer++;
            }
        }

        return answer;
    }
}