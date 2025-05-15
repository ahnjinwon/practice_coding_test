import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> list = new ArrayList<>();
        String[] arr = {"code", "date", "maximum", "remain"};
        int extN=0;
        int sortN=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(ext)){
                extN=i;
            }
            if(arr[i].equals(sort_by)){
                sortN=i;
            }
        }
        
        for(int i=0; i<data.length; i++){
            if(data[i][extN]<val_ext){
                list.add(data[i]);
            }
        }
        
        final int sort_index=sortN;
        list.sort(Comparator.comparingInt(row -> row[sort_index]));
        int[][] answer = new int[list.size()][];
        for (int i=0; i<list.size(); i++) {
            answer[i]=list.get(i);
        }
        return answer;
    }
}