import java.util.*;
class Solution {
    HashSet<Integer> set = new HashSet<>();
    
    public boolean isPrime(int num){
        if(num == 0 || num == 1)
            return false;
        int lim = (int)Math.sqrt(num);
        
        for(int i = 2; i<=lim; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public void recursive(String comb, String other){
        // 1. set에 넣기
        if(!comb.equals("")){
            set.add(Integer.parseInt(comb));
        }

        for(int i = 0; i<other.length(); i++){
            recursive(comb + other.charAt(i),other.substring(0,i) + other.substring(i+1));
        }
        
        // 2. 수행
    }
    public int solution(String numbers) {
        int answer = 0;
        // 1. 조합을 다 찾아 set에 넣는다.
        recursive("", numbers);
        
        
        // 2. 소수 판별한다. (isPrime)
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int number = it.next();
            if(isPrime(number)){
                answer++;
            }
            
        }

        return answer;

    }
}