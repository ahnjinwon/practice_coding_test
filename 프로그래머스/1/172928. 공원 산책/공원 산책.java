class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] coor = new int[2];
        int h = park.length;
        int w = park[0].length();
        
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(park[i].charAt(j) == 'S'){
                    coor[0]=i;
                    coor[1]=j;
                }
            }
        }
        
        for(int i=0; i<routes.length; i++){
            String op = routes[i].split(" ")[0];
            int n = Integer.parseInt(routes[i].split(" ")[1]);
            
            switch(op){
                case "E" : if(coor[1]+n<w){
                    boolean canMove = true;
                    for(int j=1; j<=n; j++){
                        if(park[coor[0]].charAt(coor[1]+j) == 'X'){
                            canMove = false;
                            break;
                        }
                    }
                    if(canMove){
                        coor[1]+=n;
                    }
                }break;
                    
                case "W" : if(coor[1]-n>=0){
                    boolean canMove = true;
                    for(int j=1; j<=n; j++){
                        if(park[coor[0]].charAt(coor[1]-j) == 'X'){
                            canMove = false;
                            break;
                        }
                    }
                    if(canMove){
                        coor[1]-=n;
                    }
                }break;
                    
                case "S" : if(coor[0]+n<h){
                    boolean canMove = true;
                    for(int j=1; j<=n; j++){
                        if(park[coor[0]+j].charAt(coor[1]) == 'X'){
                            canMove = false;
                            break;
                        }
                    }
                    if(canMove){
                        coor[0]+=n;
                    }
                }break;
                    
                case "N" : if(coor[0]-n>=0){
                    boolean canMove = true;
                    for(int j=1; j<=n; j++){
                        if(park[coor[0]-j].charAt(coor[1]) == 'X'){
                            canMove = false;
                            break;
                        }
                    }
                    if(canMove){
                        coor[0]-=n;
                    }
                }break;
            }
        }
        return coor;
    }
}