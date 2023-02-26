class Solution {
    boolean[] visit;
    int answer = 0;
    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];
        dfs(begin, target, 0,words);
        
        return answer;
        
    }
    
    public void dfs(String begin, String target, int count, String[] words){
        if(begin.equals(target)){
            answer = count;
            return;
        }
        for(int i = 0; i< words.length; i++){
            if(visit[i]){
                continue;
            }
            int k = 0;
            for(int j = 0; j< begin.length(); j++){
            if(begin.charAt(j) == words[i].charAt(j)){
                k++;
              }
            }
            
            if(k == begin.length() -1){
                visit[i] = true;
                dfs(words[i],target,count+1, words);
                visit[i] = false;
            }
        }
    }
}