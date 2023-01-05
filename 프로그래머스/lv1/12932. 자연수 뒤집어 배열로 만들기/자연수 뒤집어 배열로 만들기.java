import java.util.*;
class Solution {
    public int[] solution(long n) {
        String str = new StringBuffer(Long.toString(n)).reverse().toString();
        
        return Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
    }
}