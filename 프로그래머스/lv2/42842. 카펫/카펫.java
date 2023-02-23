import java.util.*;
class Solution {
    int brown;
    int yellow;
    int garo;
    int sero;
    List<Integer> list = new ArrayList<>();  
    public int[] solution(int brown, int yellow) {
        this.brown = brown;
        this.yellow = yellow;
        
       
        dfs(0);
        int[] result = new int[list.size()];
        
        
        for(int i = 0; i< list.size(); i++){
            result[i] = list.get(i).intValue();
        }
        
        return result;
        
    }
    
    public void dfs(int idx){
        garo = idx;
        sero = brown/2 - idx;
        if(idx <= brown / 2 && garo >= sero + 2 && (garo - 2) * sero == yellow){ 
                list.add(garo);
                list.add(sero+2);
            return;
        }
        
        dfs(idx + 1);
        
            
    }
}