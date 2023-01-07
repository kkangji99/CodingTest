class Solution {
    public boolean solution(int x) {
        int tmp =0;
        int newX = x;
        while(newX>0){
            tmp += newX%10;
            newX = newX/10;
        }
        return (x%tmp==0)? true : false ;
    }
}