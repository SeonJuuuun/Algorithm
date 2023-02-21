import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String,Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++){
            String str = clothes[i][1];
            map.put(str, map.getOrDefault(str, 1) + 1);
        }
            
        int answer = 1;
        
       for(String key : map.keySet()){
           answer *= map.get(key);
       }
        
    
        return answer - 1;
    
    
        
    }
}
