class Solution {
    public long[] solution(int x, int n) {
       long[] result = new long[n];
        for (int i = 1; i <= n; i++) {
            result[i - 1] = (long)x * i;
        }
        return result;
    }
}