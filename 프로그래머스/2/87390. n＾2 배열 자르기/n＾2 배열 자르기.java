class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right-left+1);
        int[] answer = new int[len];
        for(int i=0; i<len; i++){
            long index = left + i;
            int row=(int)(index/n);
            int col=(int)(index%n);
            answer[i]=Math.max(row,col)+1;
        }
        return answer;
    }
}