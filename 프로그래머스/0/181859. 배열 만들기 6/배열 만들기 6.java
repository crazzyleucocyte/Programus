import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        Arrays.fill(answer,-1);
        int count =0;
        
        for(int i = 0 ;i < arr.length; i++){
            if(answer[0] == -1){
                 answer[count++]=arr[i];
            }else if(answer[count-1]==arr[i]){
                answer[--count]=-1;
            }else if(answer[count-1]!=arr[i]){
                answer[count++]=arr[i];
            }
        }
        return answer[0] == -1 ? new int[]{-1} : Arrays.copyOf(answer,count);
    }
}