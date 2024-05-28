import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
       
        int lastIdx=num_list.length;
        int[] answer = Arrays.copyOf(num_list,lastIdx+1); 
       
        if(num_list[lastIdx-1] > num_list[lastIdx-2]){
            answer[answer.length-1] = (num_list[lastIdx-1] - num_list[lastIdx-2]);
        }else answer[answer.length-1]=(num_list[lastIdx-1]*2);
        
        
        return answer;
    }
}