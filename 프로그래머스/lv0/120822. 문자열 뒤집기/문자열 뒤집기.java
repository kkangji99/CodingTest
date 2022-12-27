class Solution {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        String tmp="";
        
        for(int i=0; i<my_string.length(); i++){
            tmp+= answer[my_string.length()-1-i];
        }
        
        
        return tmp;
    }
}