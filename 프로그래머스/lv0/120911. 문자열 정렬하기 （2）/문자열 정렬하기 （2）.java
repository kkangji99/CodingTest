import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] answer = new String[my_string.length()];
        String str = "";
        answer = my_string.toLowerCase().split("");
        Arrays.sort(answer);
        for(String s : answer){
            str+=s;
        }
        return str;
    }
}