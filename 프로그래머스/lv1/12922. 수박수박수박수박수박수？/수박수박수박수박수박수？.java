class Solution {
    public String solution(int n) {
        String answer = "";
        String tmp = "수박";
        for(int i=0; i<n/2; i++){
            answer+=tmp;            
        }
        if(n%2!=0){
            return answer+="수";
        }
        else{
            return answer;
        }
    }
}