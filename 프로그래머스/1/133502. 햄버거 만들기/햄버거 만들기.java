import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> arr = new ArrayList<>();

        for (int i : ingredient) {
            arr.add(i);

            int size = arr.size();
            if (size >= 4 &&
                arr.get(size - 4) == 1 &&
                arr.get(size - 3) == 2 &&
                arr.get(size - 2) == 3 &&
                arr.get(size - 1) == 1) {
                
                arr.remove(size - 1);
                arr.remove(size - 2);
                arr.remove(size - 3);
                arr.remove(size - 4);
                
                answer++;
            }
        }

        return answer;
    }
}