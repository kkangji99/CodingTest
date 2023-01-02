import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String[] answer = my_string.replaceAll("[^0-9]","").split("");
        int[] ans = new int[answer.length];
        // 문자열안의 숫자만 고름 / 정렬
        for(int i=0; i<answer.length; i++){
            ans[i] = Integer.parseInt(answer[i]);
        }
        Arrays.sort(ans);
        return ans;
    }
}