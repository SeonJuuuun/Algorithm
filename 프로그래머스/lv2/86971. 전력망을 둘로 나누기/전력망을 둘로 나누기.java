import java.util.*;
class Solution {
    int[][] arr;
    int n;
    int answer = Integer.MAX_VALUE;
    public int solution(int n, int[][] wires) {
        this.n = n;
        
        arr = new int[n+1][n+1];
        
        for(int i = 0; i < wires.length; i++){
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        
        for(int i = 0; i < wires.length; i++){
            int left = wires[i][0];
            int right = wires[i][1];
            
            arr[left][right] = 0;
            arr[right][left] = 0;
            
            answer = Math.min(answer,bfs(left));
            
            arr[left][right] = 1;
            arr[right][left] = 1;
        }
        return answer;

    }
    public int bfs(int left){
        Queue<Integer> q = new LinkedList<>();
        int count = 1;
        q.add(left);
        boolean[] visit = new boolean[n+1];
        
        while(!q.isEmpty()){
            int idx = q.poll();
            visit[idx] = true;
            for(int i = 1; i < n+1; i++){
                if(!visit[i] && arr[idx][i] == 1){
                    q.add(i);
                    count++;
                }
            }
            
        }
        return Math.abs(count - (n-count));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}