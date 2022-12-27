class Solution {
    public int solution(int n) {
        
        String[] str = Integer.toString(n).split("");
        int add=0;
        
        for(int i=0; i<str.length;i++)
            add += Integer.valueOf(str[i]);
        
        return add;
    }
}