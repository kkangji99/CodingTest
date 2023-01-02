import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=i; a<=j;a++){
            answer += Integer.toString(a).length()
                - Integer.toString(a).replace(Integer.toString(k), "").length();
        }
        return answer;
    }
}