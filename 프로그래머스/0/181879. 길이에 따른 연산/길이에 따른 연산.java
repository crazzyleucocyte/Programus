class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        for(int num : num_list){
            answer = (num_list.length>=11) ? answer+num:answer*num;
        }
        return (num_list.length>=11) ? answer-1:answer;
    }
}