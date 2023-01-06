class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int tmp =0;        
        long ori = (long)x;
        
        for(int i=0; i<n;i++){
            answer[tmp++] = ori;
            ori+= (long)x;
        }
        
        return answer;
    }
}