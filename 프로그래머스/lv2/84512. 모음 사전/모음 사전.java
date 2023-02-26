import java.util.*;
class Solution {
    String[] arr;
    String word;
    int answer = 0;
    List<String> list = new ArrayList<>();
    public int solution(String word) {
        this.word = word;
        arr = new String[]{"A", "E", "I", "O", "U"};
        
        
        dfs(0,"");
        
        for(int i = 0; i<list.size(); i++){
            if(list.get(i).equals(word))
                answer = i;
        }
        return answer;
    }
    public void dfs(int depth, String str){
        list.add(str);
        if(depth == 5){
            return;
        }
        
        for(int i = 0; i< arr.length;i++){
            dfs(depth+1, str + arr[i]);
        }
    
    }
}