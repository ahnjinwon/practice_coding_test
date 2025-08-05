import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:scoville){
            pq.add(i);
        }
        while(pq.size()>=2 && pq.peek() < K){
            int min = pq.poll();
            int second = pq.poll();
            int mix = min+(second*2);
            pq.add(mix);
            answer++;
        }   
        return pq.peek() < K ? -1 : answer;
    }
}