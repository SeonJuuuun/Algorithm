class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];
        
        for(int i = 1; i <triangle.length; i++){
            dp[i][0] = dp[i-1][0] + triangle[i][0];
            dp[i][i] = dp[i-1][i] + triangle[i][i];
        }
        
            
        
        
        for(int i = 1; i< triangle.length; i++){
            for(int j = 1; j <= i; j++){
                dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j]) + triangle[i][j];
            }
        }
        
        int max = 0;
        for(int i =0; i< triangle.length;i++){
            if(max < dp[triangle.length-1][i])
                max = dp[triangle.length-1][i];
            }
        
        return max;
    }
    
    
}