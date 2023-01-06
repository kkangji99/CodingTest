class Solution {
    public int solution(String s) {
        return (s.contains("[-]")) ? 0 - Integer.parseInt(s) : Integer.parseInt(s);
    }
}