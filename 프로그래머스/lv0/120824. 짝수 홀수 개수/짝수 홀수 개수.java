class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int z =0;
        int h = 0;
        for(int i=0; i<num_list.length;i++)
        {
            //짝수            
            if(num_list[i]%2==0)
            {
                z++;
            }
            else
            {
                h++;
            }
        }
        answer[0] = z;
        answer[1] = h;
        
        
        return answer;
    }
}