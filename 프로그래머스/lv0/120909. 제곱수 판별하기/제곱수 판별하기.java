import java.lang.Math;
class Solution {
    public int solution(int n) {
        int answer = 0;
        if(Double.toString(Math.sqrt(n)).contains(".0")) answer = 1;
        else answer = 2;
        return  answer;
    }
}