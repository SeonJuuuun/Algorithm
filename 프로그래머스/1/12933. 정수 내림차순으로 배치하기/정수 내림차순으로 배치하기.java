import java.util.*;

class Solution {
    public long solution(long n) {
        Integer[] arrNum = Arrays.stream(String.valueOf(n)
                        .split(""))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Arrays.sort(arrNum, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int num : arrNum) {
            sb.append(num);
        }

        return Long.parseLong(sb.toString());
    }
}