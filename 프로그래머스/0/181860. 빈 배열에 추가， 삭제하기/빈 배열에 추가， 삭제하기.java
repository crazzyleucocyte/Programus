import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> num = new ArrayList();
        for(int i = 0 ;i < arr.length; i++){
            if(flag[i]){
                for(int j = 0;j<arr[i];j++){
                    num.add(arr[i]);
                    num.add(arr[i]);
                }
            }else{
                for(int j = 0;j < arr[i];j++)
                num.remove(num.size()-1);
            }
        }
        int[] answer = new int[num.size()];
        
        for(int i=0;i < num.size(); i++){
            answer[i]=num.get(i);
        }
        return answer;
    }
}