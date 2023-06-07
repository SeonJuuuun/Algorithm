import java.util.*;
class Solution {
    public int solution(int[] order) {
        Stack<Integer> subBelt = new Stack<Integer>();
        int result = 0;
        
        int currentBoxIdx = 1;
        int orderIdx = 0;
        // idx가 order.length 커버리는 경우는 없음.
        while(orderIdx < order.length){
            if(order[orderIdx] > currentBoxIdx){
                subBelt.push(currentBoxIdx);
                currentBoxIdx++;
            } // 1, 2, 3이 들어감
            else if(order[orderIdx] == currentBoxIdx){
                result++;
                orderIdx++;
                currentBoxIdx++;
            } // 4가 들어감
            else{
                while (!subBelt.isEmpty() && order[orderIdx] == subBelt.peek()) {
                    subBelt.pop();
                    result++;
                    orderIdx++;
                }
                if (orderIdx >= order.length || order[orderIdx] < currentBoxIdx) break;
            }
            
            
        }
        return result;
    }
}