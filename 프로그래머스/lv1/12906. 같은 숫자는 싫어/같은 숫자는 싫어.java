import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        List<Integer> list = new ArrayList<>();
        int number = -1;
        for(int i = 0; i<arr.length;i++){
            if(number != arr[i]){
                number = arr[i];
                list.add(arr[i]);
            }
        }
        
        
        
        int[] num = new int[list.size()];
        
        for(int i = 0 ; i< list.size(); i++){
            num[i] = list.get(i);
        }
        
        return num;
    }
}