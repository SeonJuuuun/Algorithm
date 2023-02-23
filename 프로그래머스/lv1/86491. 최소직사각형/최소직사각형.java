import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        
        int[] max_garo = new int[sizes.length];
        int[] max_sero = new int[sizes.length];
        for(int i =0; i< sizes.length;i++){
            max_garo[i] = Math.max(sizes[i][0],sizes[i][1]);
            max_sero[i] = Math.min(sizes[i][0],sizes[i][1]);
        }
        
        Arrays.sort(max_garo);
        Arrays.sort(max_sero);
        
        return max_garo[max_garo.length-1] * max_sero[max_sero.length-1];
    }
}