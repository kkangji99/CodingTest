import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int tmp = 0;
        
        if(direction.equals("right")){
            tmp = numbers[len-1];
            for(int i=len-1;i>=1;i--){
                numbers[i] = numbers[i-1];
            }
            numbers[0] = tmp;
        }
        else{
            tmp = numbers[0];
            for(int i=0;i<len-1;i++){
                numbers[i] = numbers[i+1];
            }
            numbers[len-1] = tmp; 
        }
        return numbers;
    }
}