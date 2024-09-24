import java.util.Arrays;

class Solution {
    public boolean solution(int x) {
        String st = String.valueOf(x);
        String[] str = st.split("");
        int answer = Arrays.stream(str).mapToInt(Integer::parseInt).sum();
        return x % answer == 0;
    }
}