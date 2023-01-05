class Solution {
    boolean solution(String s) {
        int pCnt = s.replaceAll("[^pP]","").length();
        int yCnt = s.replaceAll("[^yY]","").length();

        return (pCnt==yCnt) ? true:false;
    }
}