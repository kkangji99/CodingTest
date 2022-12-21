class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int add = 0;
        for(int i=0; i<cipher.length();i++){
            add++;
            if(add%code==0) answer+=cipher.charAt(i);
                
        }
        return answer;
    }
}