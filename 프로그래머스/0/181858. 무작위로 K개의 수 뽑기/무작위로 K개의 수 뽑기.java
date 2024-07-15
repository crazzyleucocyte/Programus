import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer,-1);
        List temp = new ArrayList();
        int idx=0;
        for(int i = 0; i < arr.length;i++){
            if(!temp.contains(arr[i])){
                answer[idx++]=arr[i];
                if(idx-1==k-1) return answer;
                temp.add(arr[i]);
            }
        }
        return answer;
    }
}