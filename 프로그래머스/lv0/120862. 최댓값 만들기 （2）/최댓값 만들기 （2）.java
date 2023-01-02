import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        // 가장 큰수와 두번째로 큰수를 구해야 함
        Arrays.sort(numbers);
        int mi = numbers[0] * numbers[1];
        int pul = numbers[numbers.length-1] * numbers[numbers.length-2];
        if(pul>mi) {
            return pul;
        }
        else
            return mi;
            
        
        
    }
}